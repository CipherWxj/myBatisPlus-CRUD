package com.example.mp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.service.UserService;
import com.example.mp.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import com.example.mp.dao.UserMapper;
import com.example.mp.model.User;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 @Description: controller层，实现CURD
 @author: WXj
 @date: 2021年02月20日
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserServiceImpl userService;

    /**
    *Create
     */
    @PostMapping
    public Object add(@RequestBody User user){
        Date now = new Date();
        user.setCreateTime(now);
        return userMapper.insert(user);

    }

    /**
    *Delete
     */
    @DeleteMapping("/{id}")
    public Object deleteById(@PathVariable("id") Integer id){
        return userMapper.deleteById(id);
    }

    /**
    *Update
     */
    @PutMapping
    public Object updateById(@RequestBody User user){
        return userMapper.updateById(user);
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
