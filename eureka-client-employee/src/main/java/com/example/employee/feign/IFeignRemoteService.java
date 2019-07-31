package com.example.employee.feign;

import com.example.bean.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
// 注册中心提供服务的服务名称
@FeignClient("eureka-client-customer")
public interface IFeignRemoteService {

    /**
     *
     */
    @GetMapping("/customer/personal/information/{id}")
    Customer getInformationById(@PathVariable("id") Long customerId);
}
