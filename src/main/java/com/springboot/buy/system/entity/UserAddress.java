package com.springboot.buy.system.entity;

import lombok.Data;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-11:05
 */
@Data
public class UserAddress {
    private Integer id;
    private Integer userId;
    private String address;
    private String  createTime;
    private Integer isDefault;
    private String remark;
}
