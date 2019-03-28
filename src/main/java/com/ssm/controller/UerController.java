package com.ssm.controller;

import com.ssm.pojo.DelChose;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;
/*
* SSM增删改查数据异常未处理
* //login模块
    public List<User> login(String loginId);
    //public List<User> loginIdIn(String loginId);
    //查询模块
    public List<User> list();
    //增删改模块
    public int add(User user);
    public int del(DelChose delChose);
    public int upd(User user);
* */
@Controller
public class UerController {
    @Resource
    UserService userService;
    /*
    * login模块
    * */
    @GetMapping("/login")
    public String login(){
        return "user/login";
    }
    @PostMapping("/login")
    public String login(String loginId, String password){
        List<User> list=userService.login(loginId);
        if(list.size()==1){
            if(password.equals(list.get(0).getPassword()))
                return "redirect:/user/list";
        }
        return "redirect:/login";
    }
    /*
    * list模块
    * */
    @GetMapping("/user/list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView("user/list");
        modelAndView.addObject("list",userService.list());
        return modelAndView;
    }
    /*
    * add、delete、update模块
    * */
    //add
    @GetMapping("/user/add")
    public String add(){
        return "user/add";
    }
    @PostMapping("/user/add")
    public String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }
    //delete
    @GetMapping("/user/del")
    public String del(DelChose delChose){
        System.out.println("******con");
        System.out.println(delChose.getId()+"/"+delChose.getFlag());
        System.out.println("******");
        userService.del(delChose);
        return "redirect:/user/list";
    }
    //update
    @GetMapping("/user/upd")
    public ModelAndView upd(String loginId){
        ModelAndView modelAndView2=new ModelAndView("redirect:/user/list");
        if(userService.login(loginId).size()>0){
            ModelAndView modelAndView=new ModelAndView("user/update");
            modelAndView.addObject("list",userService.login(loginId).get(0));
            return modelAndView;
        }
        return modelAndView2;
    }
    @PostMapping("/user/upd")
    public String upd(User user){
        userService.upd(user);
        return "redirect:/user/list";
    }



}
