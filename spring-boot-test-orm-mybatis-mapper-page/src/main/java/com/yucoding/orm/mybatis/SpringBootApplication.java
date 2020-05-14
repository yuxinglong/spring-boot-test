package com.yucoding.orm.mybatis;

import org.springframework.boot.SpringApplication;
import tk.mybatis.spring.annotation.MapperScan;

@org.springframework.boot.autoconfigure.SpringBootApplication
@MapperScan(basePackages = {"com.yucoding.orm.mybatis.mapper"})
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
