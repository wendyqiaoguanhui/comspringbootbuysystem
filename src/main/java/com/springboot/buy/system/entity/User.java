package com.springboot.buy.system.entity;

import lombok.Data;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/10/16-9:48
 */
public class User {
     private Integer id;
     private String loginName;
     private String username;
     private String password;
     private Integer sex;
     private String identifyCode;
     private String email;
     private Integer type;
     private String fileName;
     private String mobile;
     private List<Order> order;
     private List<UserAddress> userAddresses;
     private List<Cart> carts;

     @Override
     public String toString() {
          return "User{" +
                  "id=" + id +
                  ", loginName='" + loginName + '\'' +
                  ", username='" + username + '\'' +
                  ", password='" + password + '\'' +
                  ", sex=" + sex +
                  ", identifyCode='" + identifyCode + '\'' +
                  ", email='" + email + '\'' +
                  ", type=" + type +
                  ", fileName='" + fileName + '\'' +
                  ", mobile='" + mobile + '\'' +
                  ", order=" + order +
                  ", userAddresses=" + userAddresses +
                  ", carts=" + carts +
                  '}';
     }

     public Integer getId() {
          return id;
     }

     public String getLoginName() {
          return loginName;
     }

     public String getUsername() {
          return username;
     }

     public String getPassword() {
          return password;
     }

     public Integer getSex() {
          return sex;
     }

     public String getIdentifyCode() {
          return identifyCode;
     }

     public String getEmail() {
          return email;
     }

     public Integer getType() {
          return type;
     }

     public String getFileName() {
          return fileName;
     }

     public String getMobile() {
          return mobile;
     }

     public List<Order> getOrder() {
          return order;
     }

     public List<UserAddress> getUserAddresses() {
          return userAddresses;
     }

     public List<Cart> getCarts() {
          return carts;
     }

     public void setId(Integer id) {

          this.id = id;
     }

     public void setLoginName(String loginName) {
          this.loginName = loginName;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public void setSex(Integer sex) {
          this.sex = sex;
     }

     public void setIdentifyCode(String identifyCode) {
          this.identifyCode = identifyCode;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public void setType(Integer type) {
          this.type = type;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }

     public void setMobile(String mobile) {
          this.mobile = mobile;
     }

     public void setOrder(List<Order> order) {
          this.order = order;
     }

     public void setUserAddresses(List<UserAddress> userAddresses) {
          this.userAddresses = userAddresses;
     }

     public void setCarts(List<Cart> carts) {
          this.carts = carts;
     }
}