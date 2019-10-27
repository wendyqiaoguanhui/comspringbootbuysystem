package com.springboot.buy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author QiaoGuanHui
 * @date 2019/10/15-9:22
 */
@SpringBootApplication
@MapperScan("com.springboot.buy.system.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
