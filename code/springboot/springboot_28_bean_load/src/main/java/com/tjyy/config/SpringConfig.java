package com.tjyy.config;


import com.tjyy.bean.Cat;
import com.tjyy.bean.Mouse;
import com.tjyy.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

//@Import(MyImportSelector.class)
@Import(Mouse.class)
public class SpringConfig {

    @Bean
//    @ConditionalOnClass(Mouse.class)
    @ConditionalOnBean(name = "jerry")
    @ConditionalOnWebApplication
    public Cat cat(){
        return new Cat();
    }

}
