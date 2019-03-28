package com.ssm.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String loginId;
    private String name;
    private String phone;
    private String password;
    private Integer sex;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private String email;
    private String address;
    private Integer isDel;

}
