package com.dryingcore.websocket_communication_microservice.repository;

import com.dryingcore.websocket_communication_microservice.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageModel, Long> {}