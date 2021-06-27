package com.example.tbao.Pojo;

import java.io.Serializable;

public class CommodityType implements Serializable {
    private Integer id;
    private String name;
    private Integer state;

    public CommodityType() {
    }

    public CommodityType(String name, Integer state) {
        this.name = name;
        this.state = state;
    }

    public CommodityType(Integer id, String name, Integer state) {
        this.id = id;
        this.name = name;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CommodityType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
