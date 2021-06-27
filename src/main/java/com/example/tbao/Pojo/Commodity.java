package com.example.tbao.Pojo;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private Integer id;
    private String name;
    private String introduce;
    private Integer price;
    private Date time;
    private CommodityType commodityType;
    private Integer userId;
    private Integer state;

    public Commodity() {
    }

    public Commodity(String name, String introduce, Integer price, Date time, CommodityType commodityType, Integer userId, Integer state) {
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.time = time;
        this.commodityType = commodityType;
        this.userId = userId;
        this.state = state;
    }

    public Commodity(Integer id, String name, String introduce, Integer price, Date time, CommodityType commodityType, Integer userId, Integer state) {
        this.id = id;
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.time = time;
        this.commodityType = commodityType;
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

    public CommodityType getCommodityType() {
        return commodityType;
    }

    public void setCommidityType(CommodityType commodityType) {
        this.commodityType = commodityType;
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
                ", commodityType=" + commodityType +
                ", userId=" + userId +
                ", state=" + state +
                '}';
    }
}
