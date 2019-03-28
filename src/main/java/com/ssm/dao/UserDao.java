package com.ssm.dao;

import com.ssm.pojo.DelChose;
import com.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //login模块
    public List<User> login(String loginId);
    //public List<User> loginIdIn(String loginId);
    //查询模块
    public List<User> list();
    //增删改模块
    public int add(User user);
    public int del(DelChose delChose);
    public int upd(User user);
}
