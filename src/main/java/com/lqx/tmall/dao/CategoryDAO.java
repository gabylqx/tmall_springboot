package com.lqx.tmall.dao;

import com.lqx.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: tmall_springboot
 * @description: Category dao层
 * 继承 JpaRepository，会提供CRUD和分页 的各种常见功能。
 * @author: Li.QiXuan
 * @create: 2019-09-24 16:09
 **/

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
