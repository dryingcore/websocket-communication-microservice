package com.dryingcore.websocket_communication_microservice.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identifier;

    // Relacionamento OneToMany com MessageModel (mensagens enviadas)
    @OneToMany(mappedBy = "sender")
    private List<MessageModel> sentMessages;

    // Relacionamento OneToMany com MessageModel (mensagens recebidas)
    @OneToMany(mappedBy = "receiver")
    private List<MessageModel> receivedMessages;

    @PrePersist
    public void prePersist() {
        if (this.identifier == null) {
            this.identifier = UUID.randomUUID().toString(); // Generate a UUID if it's null
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}


