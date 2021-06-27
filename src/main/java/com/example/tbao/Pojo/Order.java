package com.example.tbao.Pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private Integer commodityId;
    private Integer userId;
    private Integer num;

    public Order() {
    }

    public Order(Integer commodityId, Integer userId, Integer num) {
        this.commodityId = commodityId;
        this.userId = userId;
        this.num = num;
    }

    public Order(Integer id, Integer commodityId, Integer userId, Integer num) {
        this.id = id;
        this.commodityId = commodityId;
        this.userId = userId;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommondityId() {
        return commodityId;
    }

    public void setCommondityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", commodityId=" + commodityId +
                ", userId=" + userId +
                ", num=" + num +
                '}';
    }
}
