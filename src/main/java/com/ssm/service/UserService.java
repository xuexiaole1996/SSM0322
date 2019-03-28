package com.ssm.service;

import com.ssm.pojo.DelChose;
import com.ssm.pojo.User;
import java.util.List;

public interface UserService {
    //login模块
    public List<User> login(String loginId);
    //查询模块
    public List<User> list();
    //增删改模块
    public int add(User user);
    public int del(DelChose delChose);
    public int upd(User user);
}