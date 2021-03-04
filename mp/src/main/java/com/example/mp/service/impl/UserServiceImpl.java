package com.example.mp.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mp.dao.UserMapper;
import com.example.mp.model.User;
import com.example.mp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id){
        return userMapper.selectById(id);
    }

    @Override
    public Page<User> getPageList(User user) {

        return null;
    }
}
