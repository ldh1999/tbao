package com.example.tbao.Pojo;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private Integer id;
    private String name;
    private String introduce;
    private Integer price;
    private String image;
    private Date time;
    private CommodityType commodityType;
    private Integer merchantId;
    private Integer state;

    public Commodity() {
    }

    public Commodity(String name, String introduce, Integer price, String image, Date time, CommodityType commodityType, Integer merchantId, Integer state) {
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.image = image;
        this.time = time;
        this.commodityType = commodityType;
        this.merchantId = merchantId;
        this.state = state;
    }

    public Commodity(Integer id, String name, String introduce, Integer price, String image, Date time, CommodityType commodityType, Integer merchantId, Integer state) {
        this.id = id;
        this.name = name;
        this.introduce = introduce;
        this.price = price;
        this.image = image;
        this.time = time;
        this.commodityType = commodityType;
        this.merchantId = merchantId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public void setCommodityType(CommodityType commodityType) {
        this.commodityType = commodityType;
    }

    public Integer getmerchantId() {
        return merchantId;
    }

    public void setmerchantId(Integer merchantId) {
        this.merchantId = merchantId;
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
                ", image='" + image + '\'' +
                ", time=" + time +
                ", commodityType=" + commodityType +
                ", merchantId=" + merchantId +
                ", state=" + state +
                '}';
    }
}
