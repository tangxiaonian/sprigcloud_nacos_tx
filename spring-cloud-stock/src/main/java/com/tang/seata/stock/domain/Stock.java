package com.tang.seata.stock.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Classname ${NAME}
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:26
 * @Created by ASUS
 */
@Data
@Table(name = "tb_stock")
public class Stock {

    @Id
    private Integer id;

    /**
    * 商品ID
    */
    private Integer commodityId;

    /**
    * 库存余额
    */
    private Integer stock;
}