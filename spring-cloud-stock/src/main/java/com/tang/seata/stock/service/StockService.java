package com.tang.seata.stock.service;

import com.tang.seata.stock.domain.Stock;
import com.tang.seata.stock.mapper.StockMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Classname StockService
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/24 18:24
 * @Created by ASUS
 */
@Service
@Transactional
public class StockService {

    @Resource
    private StockMapper stockMapper;

    public void update() {

        Stock stock = stockMapper.selectByPrimaryKey(1);

        stock.setStock( stock.getStock() - 1 );

        stockMapper.updateByPrimaryKey(stock);

//        int i = 1 / 0;

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

}