package com.example.mp.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.dao.UserMapper;
import com.example.mp.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl{

    @Resource
    private UserMapper userMapper;

    public User selectById(Integer id){
        return userMapper.selectById(id);
    }

    public Page<User> getPageList(User user) {

        return null;
    }
}
