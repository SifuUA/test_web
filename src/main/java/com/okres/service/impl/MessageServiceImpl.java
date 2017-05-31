package main.com.okres.service.impl;

import main.com.okres.service.MessageService;

/**
 * Created by Alex on 31.05.2017.
 */
public class MessageServiceImpl implements MessageService{
    @Override
    public String getGreetings(String name) {
        return String.format("Hello, %s! How are you?", name);
    }
}
