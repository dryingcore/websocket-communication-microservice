package com.dryingcore.websocket_communication_microservice.services;

import com.dryingcore.websocket_communication_microservice.model.MessageModel;
import com.dryingcore.websocket_communication_microservice.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public MessageModel createMessage(MessageModel message) {
        return messageRepository.save(message);
    }

    public List<MessageModel> getAllMessages() {
        return messageRepository.findAll();
    }

}
