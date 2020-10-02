package com.tang.seata.order.consumer;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Classname StockFeignFallback
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2020/10/2 18:53
 * @Created by ASUS
 */
@Component
public class StockFeignFallback implements FallbackFactory<StockFeign>{

    @Override
    public StockFeign create(Throwable throwable) {
        return new StockFeign(){
            @Override
            public String reduceNumber() {
                throw new RuntimeException("调用超时，调用方回滚方法....回调里面抛异常...");
//                return "fail";
            }
        };
    }
}