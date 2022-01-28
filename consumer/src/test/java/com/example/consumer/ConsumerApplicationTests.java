package com.example.consumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ConsumerApplicationTests {

    @Test
    void contextLoads() throws InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        for(int i=0;i<1000;i++){
            restTemplate.getForObject("http://localhost:8082/list",String.class);
            Thread.sleep(200);
        }
    }

}
