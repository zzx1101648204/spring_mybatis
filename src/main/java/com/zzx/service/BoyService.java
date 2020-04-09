package com.zzx.service;

import com.zzx.entity.Boy;

import java.util.List;

public interface BoyService {
    int deleteByHigh(int high);
    List<Boy> selectByAge(int age);
}
