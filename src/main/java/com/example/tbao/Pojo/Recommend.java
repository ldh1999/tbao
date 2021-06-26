package com.example.tbao.Pojo;

import java.io.Serializable;

public class Recommend implements Serializable {
    private Integer id;
    private Integer commodityId;
    private Integer grade;

    public Recommend() {
    }

    public Recommend(Integer commodityId, Integer grade) {
        this.commodityId = commodityId;
        this.grade = grade;
    }

    public Recommend(Integer id, Integer commodityId, Integer grade) {
        this.id = id;
        this.commodityId = commodityId;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Recommed{" +
                "id=" + id +
                ", commodityId=" + commodityId +
                ", grade=" + grade +
                '}';
    }
}
