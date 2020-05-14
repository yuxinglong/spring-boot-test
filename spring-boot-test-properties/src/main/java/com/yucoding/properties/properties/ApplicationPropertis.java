package com.yucoding.properties.properties;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationPropertis {

    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;

}
