package com.dailycode.customer.Controller;
import com.dailycode.customer.Dto.AgreementDetailDTO;
import com.dailycode.customer.Dto.CustomerDTO;
import com.dailycode.customer.Dto.Request;
import com.dailycode.customer.model.Customer;
import com.dailycode.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping()
    public CustomerDTO getCustomer(@RequestBody Request inputCustomer) {
        String customerId = inputCustomer.getCustomerId();
        System.out.println(customerId + " Request in the");        // Assuming there is a customer with ID "1001" in the database
        Customer customer = customerRepository.findById(customerId).orElse(null);
        if (customer == null) {
            return null;
        }
        System.out.println(customer.getAgreementDetails() + "Agreement Data");
        // Map Customer entity to CustomerDTO
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerId(customer.getCustomerId());
        customerDTO.setCustomerName(customer.getCustomerName());
        customerDTO.setAddress(customer.getAddress());
        customerDTO.setAge(customer.getAge());
        customerDTO.setPhone(customer.getPhone());

        // Map AgreementDetail entities to AgreementDetailDTO
        List<AgreementDetailDTO> agreementDetails = customer.getAgreementDetails().stream().map(agreement -> {
            AgreementDetailDTO dto = new AgreementDetailDTO();
            dto.setAgreementId(agreement.getAgreementId());
            dto.setAgreementDate(agreement.getAgreementDate());
            dto.setProductInfo(agreement.getProductInfo());
            dto.setPaymentMethod(agreement.getPaymentMethod());
            dto.setActive(agreement.getActive());
            dto.setCustomerId(customer.getCustomerId());
            return dto;
        }).collect(Collectors.toList());

        customerDTO.setAgreementDetails(agreementDetails);

        return customerDTO;
    }
}
