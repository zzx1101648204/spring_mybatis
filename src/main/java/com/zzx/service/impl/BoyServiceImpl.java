package com.zzx.service.impl;

import com.zzx.dao.BoyDao;
import com.zzx.dao.UserDao;
import com.zzx.entity.Boy;
import com.zzx.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoyServiceImpl implements BoyService {


    @Autowired
    private BoyDao boyDao;

    public int deleteByHigh(int high) {
        return boyDao.deleteByHigh(high);
    }

    public List<Boy> selectByAge(int age) {
        return boyDao.selectByAge(age);
    }
}
