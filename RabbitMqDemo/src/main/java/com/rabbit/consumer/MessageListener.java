package com.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbit.config.MQConfig;

@Component
public class MessageListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomerMessage message) {
        System.out.println(message);
    }

}
