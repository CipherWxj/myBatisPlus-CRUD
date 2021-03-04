package com.example.mp.dao;


import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp.model.User;


@Repository
public interface UserMapper extends BaseMapper<User> {

    User selectById(Integer id);
}