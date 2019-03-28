package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.pojo.DelChose;
import com.ssm.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    UserDao userDao;
    //login模块
    public List<User> login(String loginId) {
        return userDao.login(loginId);
    }
//    public List<User> loginIdIn(String loginId) {
//        return userDao.loginIdIn(loginId);
//    }
    //查询模块
    public List<User> list() {
        return userDao.list();
    }


    //增删改模块
    public int add(User user) {
        return userDao.add(user);
    }

    public int del(DelChose delChose) {
        System.out.println("******ser");
        System.out.println(delChose.getId()+"/"+delChose.getFlag());
        System.out.println("******");
        return userDao.del(delChose);
    }

    public int upd(User user) {
        return userDao.upd(user);
    }
}
