package com.example.employee.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/employee/customer")
public class CustomerController {

    private final RestTemplate restTemplate;

    @GetMapping("/get")
    public String get() {
        Long id = 1000L;
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://EUREKA-CLIENT-CUSTOMER/customer/personal/information/" + id, String.class);
        return responseEntity.getBody();
    }
}
