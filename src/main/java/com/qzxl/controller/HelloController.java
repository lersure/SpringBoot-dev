package com.qzxl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author wqz
 * @Date 2020-04-06
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello(){
        return "jenkins,hello!";
    }
}
