package com.dryingcore.websocket_communication_microservice.controller;

import com.dryingcore.websocket_communication_microservice.model.MessageModel;
import com.dryingcore.websocket_communication_microservice.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageService messageService; // Inject the MessageService

    @PostMapping("/messages")
    public MessageModel createMessage(@RequestBody MessageModel message) {
        return messageService.createMessage(message); // Call non-static method on instance
    }

    // Endpoint para listar todas as mensagens
    @GetMapping("/messages")
    public List<MessageModel> getAllMessages() {
        return messageService.getAllMessages(); // Assuming you want to list all messages through the service
    }
}
