package com.springboot.buy.system.service;

import com.springboot.buy.system.entity.News;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-17:14
 */
public interface NewsService {
    public List<News> findForMain();
}
