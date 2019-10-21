package com.lqx.tmall.controller;

import com.lqx.tmall.pojo.Category;
import com.lqx.tmall.service.CategoryService;
import com.lqx.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: tmall_springboot
 * @description: 控制层
 * @author: Li.QiXuan
 * @create: 2019-09-24 21:08
 **/

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/categories")
    public Page4Navigator<Category> list(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Category> page =categoryService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }
}
