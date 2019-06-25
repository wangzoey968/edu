package com.controller;

import com.api.TestServiceMid;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wangzy on 2019/6/22.
 */
public class TestController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        TestServiceMid service = context.getBean("testService", TestServiceMid.class);

        List<String> list = service.testList();

        System.out.println(list.toString());
    }

}
