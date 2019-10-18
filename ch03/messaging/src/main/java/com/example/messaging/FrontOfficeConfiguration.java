package com.example.messaging;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FrontOfficeConfiguration {
    @Bean
    public FrontDeskImpl frontDesk() {
        return new FrontDeskImpl();
    }

}
