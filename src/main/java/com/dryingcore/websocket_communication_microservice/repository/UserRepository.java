package com.dryingcore.websocket_communication_microservice.repository;

import com.dryingcore.websocket_communication_microservice.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {}