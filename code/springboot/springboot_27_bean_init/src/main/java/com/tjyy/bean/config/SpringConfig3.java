package com.tjyy.bean.config;

import com.tjyy.bean.Dog;
import com.tjyy.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.tjyy.bean"})
public class SpringConfig3 {

    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }
}
