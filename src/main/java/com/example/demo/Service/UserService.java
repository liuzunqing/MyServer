package com.example.demo.Service;

import com.example.demo.Entity.User;

public interface UserService {

    //注册:插入一条数据
    void insert(User user);

    //根据userid判断用户是否存在
    boolean exists(String userid);

    //根据userid查询信息
    User findByUserid(String userid);


}
