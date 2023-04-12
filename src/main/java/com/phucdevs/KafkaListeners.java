package com.phucdevs;

import com.phucdevs.constant.KafkaConstant;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = KafkaConstant.KAFKA_TOPIC,
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🥳");
    }
}
