package com.lqx.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: tmall_springboot
 * @description: 后台管理页面跳转专用控制器
 * @author: Li.QiXuan
 * @create: 2019-09-24 16:28
 **/

@Controller
public class AdminPageController {
    @GetMapping(value = "/admin")
    public String admin(){
        //客户端跳转到 admin_category_list去
        return "redirect:admin_category_list";
    }
    //admin_category_list 就会访问 admin/listCategory.html 文件
    @GetMapping(value = "admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
