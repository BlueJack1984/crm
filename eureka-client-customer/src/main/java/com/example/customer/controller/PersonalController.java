package com.example.customer.controller;

import com.example.bean.entity.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/customer/personal")
public class PersonalController {

    @GetMapping("/information/{id}")
    public Customer getInformationById(@PathVariable("id") Long customerId) {
        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setAge(60);
        customer.setName("curry");
        customer.setCountry("United States of America");
        customer.setCompany("warriors");
        return customer;
    }
}
