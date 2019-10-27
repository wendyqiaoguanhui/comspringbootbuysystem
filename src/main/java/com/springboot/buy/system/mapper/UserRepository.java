package com.springboot.buy.system.mapper;

import com.springboot.buy.system.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-11:10
 */
@Repository
public interface UserRepository {
    public User login(String loginName, String password);
}
