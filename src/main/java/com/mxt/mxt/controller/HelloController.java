package com.mxt.mxt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/30.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hellow(){
        return "Hello World!";
    }

}
