package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.service.inter.TestServiceInter;
import org.junit.Test;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestServiceInter {

    @Override
    public void test() {
        System.out.println("--------------ssssssssssss");
    }

    @Override
    public List<String> testList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("ddddd");
        return list;
    }

}