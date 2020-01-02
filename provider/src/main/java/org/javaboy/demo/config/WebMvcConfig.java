package org.javaboy.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // ctr+i 生成实现方法
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081")
                //allowedMethods表示允许通过的请求数
                .allowedMethods("*")
                //allowedHeaders则表示允许的请求头
                .allowedHeaders("*");
    }
}
