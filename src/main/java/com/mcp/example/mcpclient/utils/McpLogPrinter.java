package com.mcp.example.mcpclient.utils;

import io.modelcontextprotocol.spec.McpSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.mcp.annotation.McpElicitation;
import org.springframework.ai.mcp.annotation.McpLogging;
import org.springframework.ai.mcp.annotation.McpProgress;
import org.springframework.stereotype.Component;

@Component
public class McpLogPrinter {

    private static final Logger log = LoggerFactory.getLogger(McpLogPrinter.class);

    @McpLogging(clients = "ticketServer")
    public void printTicketCreatorMCPServerLogs(McpSchema level,String source, String message) {
        log.info("MCP Server: ticketServer | Level: {} | Source: {} | Message: {}", level, source, message);
    }

//    @McpProgress(clients = "ticketServer")
//    public void printTicketCreatorMCPServerLogs1(McpSchema level,String source, String message) {
//        log.info("MCP Server: ticketServer | Level: {} | Source: {} | Message: {}", level, source, message);
//    }
//
//    @McpElicitation(clients = "ticketServer")
//    public void printTicketCreatorMCPServerLogs2(McpSchema.ElicitFormRequest level,String source, String message) {
//        log.info("MCP Server: ticketServer | Level: {} | Source: {} | Message: {}", level, source, message);
//    }
}
