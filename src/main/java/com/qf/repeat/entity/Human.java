package com.qf.repeat.entity;

import lombok.Data;

import java.io.Serializable;
@Data

public class Human implements Serializable {
    /**
     * 身份证号
     */
    private Integer idCard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 户籍地址
     */
    private String born;

    private static final long serialVersionUID = 1L;

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }
}

