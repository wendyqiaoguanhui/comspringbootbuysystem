package com.springboot.buy.system.entity;

import lombok.Data;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-10:52
 */
@Data
public class Cart {
    private Integer id;
    private Product product;
    private Integer quantity;
    private Integer cost;
    private User user;
}
