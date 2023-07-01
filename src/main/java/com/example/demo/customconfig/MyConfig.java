package com.example.demo.customconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean("Myproperties ")
    public Myproperties getMyproperties(){
        return new Myproperties();
    }
}
