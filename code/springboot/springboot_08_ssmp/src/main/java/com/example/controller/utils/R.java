package com.example.controller.utils;

import lombok.Data;
import org.apache.logging.log4j.message.Message;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){

    }

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(Boolean flag,Object data,String msg){
        this.data = data;
        this.flag = flag;
        this.msg = msg;
    }
}

