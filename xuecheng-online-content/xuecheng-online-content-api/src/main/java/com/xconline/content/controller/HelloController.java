package com.xconline.content.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qhy
 * @date: 2024-03-08 10:35
 * @description: 接口测试
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!";
    }
}
