package com.zzx.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Mr.John on 2018/11/25 12:01.
 **/
@Data
public class All {
    private Integer id;

    private Integer userId;

    private Integer age;

    private String cupSize;

    private Integer height;

    private String name;

    private String password;

    private Date createdBy;

    @Override
    public String toString() {
        return "All{" +
                "id=" + id +
                ", userId=" + userId +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }
}
