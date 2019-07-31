package com.example.employee.controller;

import com.example.bean.entity.Customer;
import com.example.employee.feign.IFeignRemoteService;
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
    private final IFeignRemoteService feignRemoteService;

    @GetMapping("/get")
    public Customer get() {
        Long id = 1000L;
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
//                "http://EUREKA-CLIENT-CUSTOMER/customer/personal/information/" + id, String.class);
//        return responseEntity.getBody();
        Customer customer = feignRemoteService.getInformationById(id);
        return customer;
    }

    /**
     *  学员列表分页
     * @param pageNum
     * @param pageSize
     * @return
     */
//    @Override
//    public PageInfo<Student> findByPage(int pageNum, int pageSize) {
//        //设置分页信息，该设置需在读取mapper中的方法前执行
//        PageHelper.startPage(pageNum, pageSize);
//
//        //获取所有学员结果集
//        List<Student> list = studentMapper.findAll();
//
//        PageInfo<Student> pageInfo = new PageInfo<>(list);
//
//        return pageInfo;
//    }
}
