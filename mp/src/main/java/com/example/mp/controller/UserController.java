package com.example.mp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.service.UserService;
import org.springframework.web.bind.annotation.*;

import com.example.mp.model.User;

import javax.annotation.Resource;
import java.util.Date;

/**
 @Description: controller层，实现CURD
 @author: WXj
 @date: 2021年02月20日
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    /**
    *Create
     */
    @PostMapping
    public Object add(@RequestBody User user){
        Date now = new Date();
        user.setCreateTime(now);
        System.out.println(now);
        return userService.save(user);

    }

    /**
    *Delete
     */
    @DeleteMapping("/{id}")
    public Object deleteById(@PathVariable("id") Integer id){
        return userService.removeById(id);
    }

    /**
    *Update
     */
    @PutMapping
    public Object updateById(@RequestBody User user){
        return userService.updateById(user);
    }

    /**
    Select by id
     */
    @GetMapping("/{id}")
    public Object selectById(@PathVariable("id") Integer id){
        return userService.selectById(id);
    }

    @GetMapping
    public Object getPageList(User user){
        Page<User> pageList = userService.getPageList(user);
        return pageList;
    }
}
