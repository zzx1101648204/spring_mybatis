package com.zzx.dao;

import com.zzx.entity.Boy;

public interface BoyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boy record);

    int insertSelective(Boy record);

    Boy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boy record);

    int updateByPrimaryKey(Boy record);
}