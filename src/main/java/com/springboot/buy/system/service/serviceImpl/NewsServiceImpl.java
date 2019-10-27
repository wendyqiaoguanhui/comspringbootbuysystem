package com.springboot.buy.system.service.serviceImpl;

import com.springboot.buy.system.entity.News;
import com.springboot.buy.system.mapper.NewsRepository;
import com.springboot.buy.system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-17:16
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> findForMain() {
        return newsRepository.findForMain();
    }
}
