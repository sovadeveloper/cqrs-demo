package com.sovadeveloper.cqrseventsourcingdemo.command.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.CreateUserEvent;
import com.sovadeveloper.cqrseventsourcingdemo.command.repository.EventStore;
import com.sovadeveloper.cqrseventsourcingdemo.command.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final EventStore eventStore;
    private final ObjectMapper objectMapper;

    @Override
    public void createUserEvent(CreateUserEvent event) throws JsonProcessingException {

        eventStore.save(event);
    }
}
