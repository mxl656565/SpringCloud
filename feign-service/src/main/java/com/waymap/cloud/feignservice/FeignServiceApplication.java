package com.waymap.cloud.feignservice;

import com.waymap.cloud.feignservice.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//启用hystrix熔断机制
@EnableCircuitBreaker
@EnableFeignClients(defaultConfiguration = FeignConfig.class)
@EnableDiscoveryClient
@SpringBootApplication
public class FeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceApplication.class, args);
    }

}
