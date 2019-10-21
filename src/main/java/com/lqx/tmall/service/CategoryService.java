package com.lqx.tmall.service;

import com.lqx.tmall.dao.CategoryDAO;
import com.lqx.tmall.pojo.Category;
import com.lqx.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: tmall_springboot
 * @description: 服务层
 * list方法获取对象
 * Page4Navigator方法 分页
 * @author: Li.QiXuan
 * @create: 2019-09-24 21:01
 **/

@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public Page4Navigator<Category> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA =categoryDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Category> list(){
        //排序用的类 ASC升序 DESC降序
        Sort sort = new Sort(Sort.Direction.ASC,"id");
        return categoryDAO.findAll(sort);
    }
}
