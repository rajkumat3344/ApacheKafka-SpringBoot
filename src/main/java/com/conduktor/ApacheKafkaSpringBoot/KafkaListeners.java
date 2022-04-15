package com.conduktor.ApacheKafkaSpringBoot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "rajcode",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Received Message "+ data +" 🎉");
    }
}
