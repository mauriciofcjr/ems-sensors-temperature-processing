package com.mchaves.sensors.temperature.processing.infrastructure.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class RabbitMQInitializer {

    private final RabbitAdmin rabbitAdmin;

    @PostConstruct
    public void initialize() {
        rabbitAdmin.initialize();
    }

}
