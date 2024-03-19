package com.sovadeveloper.cqrseventsourcingdemo.command.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.CreateUserEvent;

public interface UserService {

    void createUserEvent(CreateUserEvent event) throws JsonProcessingException;

}
