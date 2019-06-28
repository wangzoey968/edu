package com.service.impl;

import com.service.inter.UserServiceInter;
import org.springframework.stereotype.Service;

/**
 * Created by wangzy on 2019/6/27.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserServiceInter{
    @Override
    public void saveUser() {
        System.out.println("------");
    }
}
