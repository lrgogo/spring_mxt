package com.mxt.mxt.controller;

import com.mxt.mxt.util.ActiveException;
import com.mxt.mxt.util.ExceptionEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/1.
 */
@RequestMapping("/test")
@RestController
public class TestController {


    @GetMapping("/crash")
    public void crash() {
        int i = 1 / 0;
    }

    @GetMapping("/active")
    public void active() {
        throw new ActiveException(ExceptionEnum.USER_NOT_FIND);
    }

}
