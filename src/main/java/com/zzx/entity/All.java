package com.zzx.entity;



import java.util.Date;

/**
 * Created by Mr.John on 2018/11/25 12:01.
 **/

public class All {
    private Integer id;

    private Integer age;

    private Integer high;

    private String number;

    @Override
    public String toString() {
        return "All{" +
                "id=" + id +
                ", age=" + age +
                ", high=" + high +
                ", number='" + number + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
