package com.tang.seata.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Classname OrderApplication
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:09
 * @Created by ASUS
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(value = {"com.tang.seata.stock.mapper"})
public class StockApplication {

    public static void main(String[] args) {

        SpringApplication.run(StockApplication.class, args);


    }

}