package com.dailycode.customer.Dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Request {
    private String customerId;
    private Integer agreementId;

}
