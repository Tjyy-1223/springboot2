package com.example.controller;

import com.example.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    //读取yml中的数据
//    @Value("${country}")
//    private String country1;

    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("spring boot  is running");
        System.out.println("name =======>  "+ env.getProperty("users[0].name"));


        System.out.println("MyDataSource");
        System.out.println(myDataSource);
        return "spring boot is  running  " + env.getProperty("country");
    }

}
