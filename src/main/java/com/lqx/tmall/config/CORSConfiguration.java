package com.lqx.tmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: tmall_springboot
 * @description: 配置类，用于允许所有的请求都跨域。
 * 因为是二次请求，第一次是获取 html 页面，
 * 第二次通过 html 页面上的 js 代码异步获取数据，
 * 一旦部署到服务器就容易面临跨域请求问题，
 * 所以允许所有访问都跨域，就不会出现通过 ajax 获取数据获取不到的问题了。
 * @author: Li.QiXuan
 * @create: 2019-09-24 16:42
 **/

@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}