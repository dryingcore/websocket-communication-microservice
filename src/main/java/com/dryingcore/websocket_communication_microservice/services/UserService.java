package com.dryingcore.websocket_communication_microservice.services;

import com.dryingcore.websocket_communication_microservice.model.UserModel;
import com.dryingcore.websocket_communication_microservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel user) {
        // Gera o identifier caso ele não tenha sido fornecido
        if (user.getIdentifier() == null) {
            user.setIdentifier(UUID.randomUUID().toString()); // Gera um UUID
        }
        return userRepository.save(user); // Salva o usuário no banco
    }

    public Iterable<UserModel> getAllUsers() {
        return userRepository.findAll();
    }
}
