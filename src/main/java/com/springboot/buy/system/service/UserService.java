package com.springboot.buy.system.service;
import com.springboot.buy.system.entity.User;

/**
 * @author QiaoGuanHui
 * @date 2019/10/20-9:22
 */
public interface UserService {
    public User login(String loginName,String password);
}
