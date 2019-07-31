package com.example.employee.feign.impl;

import com.example.bean.entity.Customer;
import com.example.employee.feign.IFeignRemoteService;
import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Slf4j
public class FeignRemoteServiceImpl implements IFeignRemoteService {

    /**
     *
     * @param customerId
     * @return
     */
    @Override
    public Customer getInformationById(Long customerId) {
        return null;
    }
}
