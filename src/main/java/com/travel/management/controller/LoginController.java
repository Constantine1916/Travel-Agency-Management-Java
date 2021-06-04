package com.travel.management.controller;

import com.alibaba.fastjson.JSON;
import com.travel.management.bean.User;
import com.travel.management.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag = "error";
        User us = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        HashMap<String, Object> res = new HashMap<>();
        if (us!=null){
            flag = "ok";
            res.put("id", us.getId());
            res.put("user",user);
        } else {
            flag = "error";
        }
        res.put("flag",flag);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
