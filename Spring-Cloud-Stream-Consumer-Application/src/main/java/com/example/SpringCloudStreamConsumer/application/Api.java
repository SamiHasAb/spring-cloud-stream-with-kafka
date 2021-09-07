package com.example.SpringCloudStreamConsumer.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
public class Api {

    @StreamListener("input")
    public void consumeMessage(Book book) {

        log.info("Consume payload : " + book);
    }
}
