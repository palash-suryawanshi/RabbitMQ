package com.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomerMessage message) {
        System.out.println(message);
    }

}
