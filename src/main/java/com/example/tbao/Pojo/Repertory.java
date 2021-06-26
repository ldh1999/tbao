package com.example.tbao.Pojo;

import java.io.Serializable;

public class Repertory implements Serializable {
    private Integer id;
    private Integer num;
    private Integer commodityId;

    public Repertory() {
    }

    public Repertory(Integer num, Integer commodityId) {
        this.num = num;
        this.commodityId = commodityId;
    }

    public Repertory(Integer id, Integer num, Integer commodityId) {
        this.id = id;
        this.num = num;
        this.commodityId = commodityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "id=" + id +
                ", num=" + num +
                ", commodityId=" + commodityId +
                '}';
    }
}
