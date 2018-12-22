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
    @Select("SELECT  a.* ,b.user_id,b.cup_size,b.age,b.height FROM user a inner join girl b ON a.id=b.user_id WHERE b.cup_size=#{cupSize}")
    List<All> gets(@Param("cupSize") String cupSize);
}
