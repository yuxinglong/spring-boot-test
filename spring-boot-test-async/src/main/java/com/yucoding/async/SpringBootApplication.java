package com.yucoding.async;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

}
