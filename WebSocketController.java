package com.main;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/edit")
    @SendTo("/topic/document")
    public String handleDocumentEdit(String content) {
        return content;
    }
}