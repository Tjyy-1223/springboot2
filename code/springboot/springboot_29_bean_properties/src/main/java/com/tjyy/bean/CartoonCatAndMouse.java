package com.tjyy.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Data
@EnableConfigurationProperties(CartoonProperties.class)
public class CartoonCatAndMouse {

    private Cat cat;
    private Mouse mouse;
    private CartoonProperties cartoonProperties;

    public CartoonCatAndMouse(CartoonProperties cartoonProperties){

        this.cartoonProperties = cartoonProperties;
        cat = new Cat();
        cat.setName(cartoonProperties.getCat()!=null &&
                StringUtils.hasText(cartoonProperties.getCat().getName())?
                cartoonProperties.getCat().getName():"tom");

        mouse = new Mouse();
        mouse.setName(cartoonProperties.getCat()!=null &&
                StringUtils.hasText(cartoonProperties.getMouse().getName())?
                cartoonProperties.getMouse().getName():"jjjjeuueu");

    }

    public void play(){
        System.out.println(cat.getName() + " fight " + mouse.getName());
    }

}
