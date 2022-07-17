package com.example.service.Impl;

import com.example.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MessageServiceImpl implements MessageService {

    private ArrayList<String> msgList = new ArrayList<>();

    @Override
    public void sendMessage(String id) {
        System.out.println("put into mq , id : " + id);
        msgList.add(id);
    }

    @Override
    public String doMessage() {
        String id = msgList.remove(0);
        System.out.println("finish task..."+id);
        return id;
    }
}
