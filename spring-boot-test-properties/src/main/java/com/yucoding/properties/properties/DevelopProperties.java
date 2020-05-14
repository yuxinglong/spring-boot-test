package com.yucoding.properties.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix="develop")
@Component
public class DevelopProperties {

    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
