package com.zzx.dao;

import com.zzx.entity.Boy;

import java.util.List;

public interface BoyDao {

    int deleteByHigh(int high);
    List<Boy> selectByAge(int age);
}
