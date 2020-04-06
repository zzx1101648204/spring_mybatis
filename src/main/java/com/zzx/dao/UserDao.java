package com.zzx.dao;

import com.zzx.entity.All;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Mr.John on 2018/11/24 16:44.
 **/
@Mapper
public interface UserDao {
    @Select("SELECT * FROM girl WHERE id=#{id}")
    List<All> gets(@Param("id") String id);
}
