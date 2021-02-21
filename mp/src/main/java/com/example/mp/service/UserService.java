package com.example.mp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mp.model.User;

public interface UserService extends IService<User> {

    User selectById(Integer id);

    Page<User> getPageList(User user);
}
