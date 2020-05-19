package com.yucoding.task.quartz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@MapperScan(basePackages = {"com.yucoding.task.quartz.mapper"})
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

}
