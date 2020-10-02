package com.tang.seata.order.service;

import com.tang.seata.order.consumer.StockFeign;
import com.tang.seata.order.domain.Order;
import com.tang.seata.order.mapper.OrderMapper;
import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.tm.api.GlobalTransactionContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Classname OrderService
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/24 17:00
 * @Created by ASUS
 */
@Service
@Transactional
public class OrderService {

    @Resource
    private StockFeign stockFeign;

    @Resource
    private OrderMapper orderMapper;

    @GlobalTransactional
    public void add(Order order, Integer i) {

        orderMapper.insert(order);

        String value = stockFeign.reduceNumber();

        System.out.println( value );

        throw new RuntimeException("11");

//        int a = 1 / i;

    }

}