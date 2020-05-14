package com.yucoding.logback;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
@Slf4j
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
        int length = 0;
        log.trace("Spring boot启动初始化了 {} 个 Bean", length);
        log.debug("Spring boot启动初始化了 {} 个 Bean", length);
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
        log.warn("Spring boot启动初始化了 {} 个 Bean", length);
        log.error("Spring boot启动初始化了 {} 个 Bean", length);
        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            log.error("【SpringBootDemoLogbackApplication】启动异常：", e);
        }

    }
}
