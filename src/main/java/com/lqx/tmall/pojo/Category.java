package com.lqx.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @program: tmall_springboot
 * @description: Category-分类
 *  id int(11) NOT NULL AUTO_INCREMENT,
 *  name varchar(255) DEFAULT NULL,
 * @author: Li.QiXuan
 * @create: 2019-09-24 15:55
 **/

@Entity
@Table(name = "category")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer"})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
