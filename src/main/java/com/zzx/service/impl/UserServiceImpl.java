package com.zzx.service.impl;

import com.zzx.dao.UserMapper;
import com.zzx.entity.User;
import com.zzx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by:  John Zhu
 * Date: 2018/9/11 14:46
 **/
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;




    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record) {
        return userMapper.insert(record);
    }

    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "myCache")
    public User selectByPrimaryKey(Integer id) {
        System.out.println("从数据库获取数据");
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}