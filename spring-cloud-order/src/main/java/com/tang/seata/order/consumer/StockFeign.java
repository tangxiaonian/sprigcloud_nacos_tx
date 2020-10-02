package com.tang.seata.order.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname StockFeign
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:31
 * @Created by ASUS
 */
@FeignClient(value="spring-cloud-stock-8082",fallbackFactory = StockFeignFallback.class)
public interface StockFeign {

    @GetMapping("/stock/reduce")
    public String reduceNumber();
}
