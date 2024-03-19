package com.sovadeveloper.cqrseventsourcingdemo.command.domain.aggregate;

import lombok.Data;

@Data
public class PassportAggregate {

    private Long id;

    private String serial;

    private String number;

}
