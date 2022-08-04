package com.belajar.belajar.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TestBeans {

    @Bean // objek
    public String appSaya(){
        return "aplikasi pertama saya";
    }
}
