package com.springboot.buy.system.mapper;

import com.springboot.buy.system.entity.Product;
import com.springboot.buy.system.entity.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-15:10
 */
@Repository
public interface ProductCategoryRepository {
    public List<ProductCategory> findProductCategoryByLevel(ProductCategory productCategory);
    public List<Product> findAllProductByLevel(ProductCategory productCategory);
}
