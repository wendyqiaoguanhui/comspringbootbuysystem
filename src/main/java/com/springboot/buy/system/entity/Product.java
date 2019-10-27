package com.springboot.buy.system.entity;

import lombok.Data;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-10:54
 */
@Data
public class Product {
    private Integer id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 产品名称
     */
    private Integer price;
    /**
     * 产品库存
     */
    private Integer stock;
    /**
     * 产品分类
     */
    private Integer categoryLevel1Id;
    private Integer categoryLevel2Id;
    private Integer categoryLevel3Id;
    /**
     * 产品文件图片名字
     */
    private String fileName;
    private Integer isDelete;
    private List<OrderDetail> orderDetails;
    /**
     * 产品数量
     */
    private Integer quantity;
}
