package com.phucdevs.config;

import com.phucdevs.constant.KafkaConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic phucdevsTopic() {
        return TopicBuilder.name(KafkaConstant.KAFKA_TOPIC)
                .build();
    }
}
