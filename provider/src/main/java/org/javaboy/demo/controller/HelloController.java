package org.javaboy.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * 使用CORS可以在前端代码不做任何修改的情况下，实现跨域，那么接下来看看在provider中如何配置。
     * 首先可以通过@CrossOrigin注解配置某一个方法接受某一个域的请求，如下：
     * 解决跨域另一方法：
     * 增加 @Configuration 配置类、类名自取 implement WebConfigurer 中的 addCorsMapping(CorsRegistry registry)
     * @return
     */
    @CrossOrigin(value = "http://localhost:8081")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @PostMapping("/hello")
    public String hello2() {
        return "post hello";
    }
}
