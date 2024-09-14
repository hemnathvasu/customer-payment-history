package com.dailycode.customer.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class CustomerDTO {
    private String customerId;
    private String customerName;
    private String address;
    private int age;
    private long phone;
    private List<AgreementDetailDTO> agreementDetails;
}
