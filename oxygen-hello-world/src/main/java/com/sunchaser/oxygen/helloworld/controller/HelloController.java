package com.sunchaser.oxygen.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2022/3/6
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello Spring Boot");
        return "Spring Boot";
    }
}