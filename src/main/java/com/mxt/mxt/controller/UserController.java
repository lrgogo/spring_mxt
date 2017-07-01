package com.mxt.mxt.controller;

import com.mxt.mxt.pojo.Result;
import com.mxt.mxt.pojo.TbUser;
import com.mxt.mxt.service.UserService;
import com.mxt.mxt.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/7/1.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public Result createUser(@RequestParam("name") String name) {
        userService.createUser(name);
        return ResultUtils.success();
    }

    @GetMapping("/createUser")
    public Result createUser2(@RequestParam("name") String name){
        userService.createUser(name);
        return ResultUtils.success();
    }

    @GetMapping("")
    public Result getAllUser(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return ResultUtils.success(userService.getAllUser(page, size));
    }

    @GetMapping("/{id}")
    public Result getUser(@PathVariable("id") Long id) {
        return ResultUtils.success(userService.getUser(id));
    }


}
