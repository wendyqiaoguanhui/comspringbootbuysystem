package com.springboot.buy.system.entity;

import lombok.Data;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-11:01
 */
@Data
public class News {
    private Integer id;
    private String title;
    private String content;
    private String createTime;
}
