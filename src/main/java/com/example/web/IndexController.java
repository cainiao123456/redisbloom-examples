package com.example.web;

import com.example.entity.User;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 赵奇伟
 * @description index
 * @date 2020/8/20
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index/{id}")
    @ResponseBody
    public String index(@PathVariable("id") Integer id){

        System.out.println(123);
        User user = new User();
        user.setId(id);
        try {
            userService.selectById(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "123";
    }
}
