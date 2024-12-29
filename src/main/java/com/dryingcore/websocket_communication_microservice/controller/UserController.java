package com.dryingcore.websocket_communication_microservice.controller;

import com.dryingcore.websocket_communication_microservice.model.UserModel;
import com.dryingcore.websocket_communication_microservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint para criar um usuário
    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public Iterable<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }
}
