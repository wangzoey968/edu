package com.controller;

import com.api.ControlService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wangzy on 2019/6/22.
 */
public class HelloController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        ControlService service = context.getBean("controlService", ControlService.class);

        List<String> list = service.testList();

        System.out.println(list.toString());

    }

}
