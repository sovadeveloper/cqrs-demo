package com.sovadeveloper.cqrseventsourcingdemo.command.repository;

import com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.CreateUserEvent;
import com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventStore extends JpaRepository<CreateUserEvent, Long> {

}
