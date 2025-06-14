package com.ragheb.kafka.consumer;

import com.ragheb.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "ragheb", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info("Consuming the message from ragheb Topic:: {}", msg);
    }

    @KafkaListener(topics = "ragheb", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info("Consuming the message from ragheb Topic:: {}", student.toString());
    }
}
