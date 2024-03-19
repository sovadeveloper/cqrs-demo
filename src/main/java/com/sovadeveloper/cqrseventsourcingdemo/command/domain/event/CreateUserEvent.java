package com.sovadeveloper.cqrseventsourcingdemo.command.domain.event;


import com.sovadeveloper.cqrseventsourcingdemo.command.domain.aggregate.AggregateType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static com.sovadeveloper.cqrseventsourcingdemo.command.domain.aggregate.AggregateType.USER;
import static com.sovadeveloper.cqrseventsourcingdemo.command.domain.event.EventType.CREATE_USER_EVENT;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "user_events")
public class CreateUserEvent extends Event {

    @Enumerated(EnumType.ORDINAL)
    private final EventType eventType = CREATE_USER_EVENT;

    @Enumerated(EnumType.ORDINAL)
    private final AggregateType aggregateType = USER;

    private String username;

    private Integer age;

}
