package com.springboot.buy.system.entity;

import lombok.Data;

/**
 * 订单详情
 * @author QiaoGuanHui
 * @date 2019/10/16-10:56
 */
@Data
public class OrderDetail {
    private Integer id;
    /**
     * 订单号
     */
    private Order order;
    /**
     * 产品号
     */
    private Product product;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 消费
     */
    private Integer cost;

}
