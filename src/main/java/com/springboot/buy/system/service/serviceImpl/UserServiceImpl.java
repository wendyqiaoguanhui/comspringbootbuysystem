package com.springboot.buy.system.service.serviceImpl;

import com.springboot.buy.system.entity.User;
import com.springboot.buy.system.mapper.UserRepository;
import com.springboot.buy.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QiaoGuanHui
 * @date 2019/10/19-9:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User  login(String loginName,String password){
        return userRepository.login(loginName, password);

    }
}
