package com.dryingcore.websocket_communication_microservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "messages")
@Getter
@Setter
@AllArgsConstructor
public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "You must provide a message body")
    private String messageBody;

    // Relacionamento ManyToOne com UserModel (remetente)
    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private UserModel sender;

    // Relacionamento ManyToOne com UserModel (destinatário)
    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private UserModel receiver;

}

