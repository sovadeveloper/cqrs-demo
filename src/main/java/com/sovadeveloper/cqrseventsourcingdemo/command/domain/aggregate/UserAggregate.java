package com.sovadeveloper.cqrseventsourcingdemo.command.domain.aggregate;

import lombok.Data;

@Data
public class UserAggregate {

    private Long id;

    private String username;

    private Integer age;

    private PassportAggregate passport;

}
