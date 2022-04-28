package com.example.yummynearby.controller;

import com.example.yummynearby.entity.User;
import com.example.yummynearby.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author watson
 * @date 2022/4/28 1:57 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/query/one")
    public User getUser(@RequestParam("id")Long id){
        return userService.getUserById(id);
    }
}
