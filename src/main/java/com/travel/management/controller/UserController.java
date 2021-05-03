package com.travel.management.controller;

import com.alibaba.fastjson.JSON;
import com.travel.management.bean.User;
import com.travel.management.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/getUserInfos")
    public String getUserInfos(int id) {
        User user = userDao.getUserInfos(id);
        String string = JSON.toJSONString(user);
        return string;
    }

    @RequestMapping("/editUser")
    public String editUser(@RequestBody User user){
        int i = userDao.editUser(user);
        return i > 0 ? "success" : "error";
    }
}
