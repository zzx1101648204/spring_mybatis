package com.zzx.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Test {

    @PostConstruct
    public void sout(){
        System.out.println("加载加载！");
    }
}
