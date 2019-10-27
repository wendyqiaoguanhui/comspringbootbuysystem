package com.springboot.buy.system.mapper;

import com.springboot.buy.system.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-17:18
 */
@Repository
public interface NewsRepository {
    public List<News> findForMain();
}
