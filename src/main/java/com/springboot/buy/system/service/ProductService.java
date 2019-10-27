package com.springboot.buy.system.service;

import com.springboot.buy.system.entity.ProductCategory;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-15:06
 */
public interface ProductService {
    public List<ProductCategory> findAllProductCategory();
}
