package com.springboot.buy.system.service.serviceImpl;

import com.springboot.buy.system.entity.Product;
import com.springboot.buy.system.entity.ProductCategory;
import com.springboot.buy.system.mapper.ProductCategoryRepository;
import com.springboot.buy.system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-15:05
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findAllProductCategory() {
        // 先查出一级分类目录
        List<ProductCategory> list1 = productCategoryRepository.findProductCategoryByLevel(new ProductCategory(1,0));
        for (ProductCategory productCategory:list1) {
            List<ProductCategory> list2 = productCategoryRepository.findProductCategoryByLevel(new ProductCategory(2,productCategory.getId()));
            for (ProductCategory productCategory2:list2) {
                List<ProductCategory> list3 = productCategoryRepository.findProductCategoryByLevel(new ProductCategory(3,productCategory2.getId()));
                productCategory2.setProductCategories(list3);
            }
            productCategory.setProductCategories(list2);
        }
        for (ProductCategory productCategory:list1){
            List<Product> products = productCategoryRepository.findAllProductByLevel(productCategory);
            productCategory.setLevelOneProducts(products);
        }
        return list1;
    }
}
