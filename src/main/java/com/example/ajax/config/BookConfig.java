package com.example.ajax.config;

import com.example.ajax.mapper.BookMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookMapper bookMapper() {
        return BookMapper.INSTANCE;
    }
}
