package com.springboot.buy.system.entity;

import lombok.Data;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-10:39
 */
@Data
public class Order {
   private Integer id;
   private Integer userId;
   private String  loginName;
   private String  userAddress;
   private String  createTime;
   private Integer cost;
   private String serialNumber;
   private List<OrderDetail> orderDetails;
}
