package com.codekul.Java28SeptSpring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean //java object
    public Vodafone getVodafone(){
        return new Vodafone();
    }

    @Bean
    public Jio getJio(){
        return new Jio();
    }

}
