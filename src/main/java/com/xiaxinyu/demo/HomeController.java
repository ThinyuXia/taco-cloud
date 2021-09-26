package com.xiaxinyu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//使用注解让Spring组件扫描将这个类识别为一个组件，
// 并创建一个HomeController实例作为Spring应用上下文中的bean
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}

