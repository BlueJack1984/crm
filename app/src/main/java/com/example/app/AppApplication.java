package com.example.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.example.app", "com.example.core.service"})
@EnableSwagger2
@MapperScan(basePackages = {"com.example.core.dao"})
@EnableEurekaClient
public class AppApplication {

    public static void main( String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
