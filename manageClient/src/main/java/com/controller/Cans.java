package com.controller;

import com.api.TestServiceMid;
import com.api.user.UserServiceMid;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangzy on 2019/6/27.
 */
public class Cans {

    private static ClassPathXmlApplicationContext context = null;

    public void loadInters() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        setTestService();
        setUserService();
    }

    private static TestServiceMid testService = null;

    private void setTestService() {
        try {
            testService = context.getBean("testService", TestServiceMid.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static UserServiceMid userService = null;

    private void setUserService() {
        try {
            userService = context.getBean("userService", UserServiceMid.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static TestServiceMid getTestService() {
        return testService;
    }

    public static UserServiceMid getUserService() {
        return userService;
    }
}
