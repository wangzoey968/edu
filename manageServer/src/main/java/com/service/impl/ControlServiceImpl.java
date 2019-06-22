package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ControlService;

@Service("controlService")
public class ControlServiceImpl implements ControlService {

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