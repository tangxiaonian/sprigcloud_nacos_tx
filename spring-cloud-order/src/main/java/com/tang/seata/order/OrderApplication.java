package com.tang.seata.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Classname OrderApplication
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:09
 * @Created by ASUS
 */
@MapperScan(value = {"com.tang.seata.order.mapper"})
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class, args);


    }

}