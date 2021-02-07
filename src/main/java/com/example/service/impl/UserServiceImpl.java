package com.example.service.impl;


import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author 赵奇伟
 * @description
 * @date 2020/8/20
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    /**
     * 通过id查询用户信息
     *
     * @param user
     * @return
     */
    @Override
    @Transactional
    public User selectById(User user) throws Exception {
        if (null == user){
            throw new Exception("缺少用户ID");
        }
//        System.out.println("xxxxx");
        User user1 = userDao.selectById(user);
        return user1;
    }
}
