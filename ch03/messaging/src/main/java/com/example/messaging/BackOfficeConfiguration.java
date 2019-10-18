package com.example.messaging;

import org.springframework.context.annotation.Bean;

public class BackOfficeConfiguration {
    @Bean
    public BackOfficeImpl backOffice() {
        return new BackOfficeImpl();
    }
}
