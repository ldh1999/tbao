package com.example.tbao.Pojo;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private Integer id;
    private String name;
    private String introduce;
    private Integer price;
    private Date time;
    private CommidityType commidityType;
    private Integer userId;
    private Integer state;

    public Commodity() {
    }

    public Commodity(String name, String introduce, Integer price, Date time, CommidityType commidityType, Integer userId, Integer state) {
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.time = time;
        this.commidityType = commidityType;
        this.userId = userId;
        this.state = state;
    }

    public Commodity(Integer id, String name, String introduce, Integer price, Date time, CommidityType commidityType, Integer userId, Integer state) {
        this.id = id;
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.time = time;
        this.commidityType = commidityType;
        this.userId = userId;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public CommidityType getCommidityType() {
        return commidityType;
    }

    public void setCommidityType(CommidityType commidityType) {
        this.commidityType = commidityType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", price=" + price +
                ", time=" + time +
                ", commidityType=" + commidityType +
                ", userId=" + userId +
                ", state=" + state +
                '}';
    }
}
