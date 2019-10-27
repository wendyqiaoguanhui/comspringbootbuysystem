package com.springboot.buy.system.controller;

import com.springboot.buy.system.entity.User;
import com.springboot.buy.system.service.NewsService;
import com.springboot.buy.system.service.ProductService;
import com.springboot.buy.system.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author QiaoGuanHui
 * @date 2019/10/15-18:17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private NewsService newsService;

    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("显示登录页面");
        return "redirect:/login.html";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("loginName") String loginName, @RequestParam("passWord") String password,
                        HttpSession session,Model model){
        System.out.println("进入登录页面");
        User user = userService.login(loginName,password);
        if (user == null) {
            return "redirect:/login.html";
        }else{
            session.setAttribute("user",user);
            return "redirect:/user/index";
        }

    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.setViewName("main");
        model.addObject("list",productService.findAllProductCategory());
        model.addObject("news",newsService.findForMain());
        return model;
    }

}
