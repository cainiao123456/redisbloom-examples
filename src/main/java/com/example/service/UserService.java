package com.example.service;

import com.example.entity.User;

public interface UserService {

    /**
     * 通过id查询用户信息
     * @param user
     * @return
     */
    public User selectById(User user) throws Exception;
}
