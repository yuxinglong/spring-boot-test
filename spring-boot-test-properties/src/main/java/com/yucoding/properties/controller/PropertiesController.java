package com.yucoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.yucoding.properties.properties.ApplicationPropertis;
import com.yucoding.properties.properties.DevelopProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    private final ApplicationPropertis applicationPropertis;
    private final DevelopProperties developProperties;

    @Autowired
    public PropertiesController(ApplicationPropertis applicationPropertis,DevelopProperties developProperties) {
        this.applicationPropertis = applicationPropertis;
        this.developProperties = developProperties;
    }

    @GetMapping("/index")
    public Dict index(){
        return Dict.create().set("applicationProperties",applicationPropertis).set("developProperties",developProperties);
    }

}
