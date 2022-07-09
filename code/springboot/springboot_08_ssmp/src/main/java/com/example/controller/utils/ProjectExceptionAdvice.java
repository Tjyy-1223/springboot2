package com.example.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// 作为spring的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //   拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        ex.printStackTrace();
        return new R(false,null,"系统错误，请稍后再试!");
    }
}
