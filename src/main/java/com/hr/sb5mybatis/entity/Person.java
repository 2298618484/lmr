package com.hr.sb5mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {


    private static final long serialVersionUID = -4818791497459893998L;
    private Integer id;

    private Date birthDay;

    private String pName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }
}