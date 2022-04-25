package com.sunchaser.oxygen.rabbitmq.controller;

import com.sunchaser.oxygen.rabbitmq.mq.producer.BootTopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息发送入口
 *
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2022/4/25
 */
@RestController
public class MQController {

    @Autowired
    private BootTopicProducer bootTopicProducer;

    @GetMapping("/send")
    public void send(String msg, String routingKey) {
        bootTopicProducer.send(msg, routingKey);
    }
}
