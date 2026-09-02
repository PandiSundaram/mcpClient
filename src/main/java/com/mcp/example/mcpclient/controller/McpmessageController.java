package com.mcp.example.mcpclient.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class McpmessageController {

    private final ChatClient chatClient;


    public McpmessageController(ChatClient.Builder chatClientBuilder, ToolCallbackProvider toolCallbackProvider) {
        this.chatClient =  chatClientBuilder.defaultAdvisors(new SimpleLoggerAdvisor()).defaultTools(toolCallbackProvider).build();
    }

    @GetMapping("/callmcpserver")
    public String getMessageFromMCPServer(@RequestParam("message") String message, @RequestHeader("name") String name){

        return chatClient.prompt().user(message+ " My username is " + name).call().content();

    }


}
