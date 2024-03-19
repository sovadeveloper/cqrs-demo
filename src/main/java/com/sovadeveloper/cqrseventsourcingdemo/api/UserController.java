package com.sovadeveloper.cqrseventsourcingdemo.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.CreateUserEvent;
import com.sovadeveloper.cqrseventsourcingdemo.command.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createUser(@RequestBody CreateUserEvent event) throws JsonProcessingException {
        userService.createUserEvent(event);
    }
}
