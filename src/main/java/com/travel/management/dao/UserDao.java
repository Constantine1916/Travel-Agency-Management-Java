package com.travel.management.dao;

import com.travel.management.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User getUserByMessage(@Param("username") String username,@Param("password") String password); // 登录判断接口
    public User getUserInfos(int id); // 获取当前用户信息
    public int editUser(User user); // 修改user信息
}
