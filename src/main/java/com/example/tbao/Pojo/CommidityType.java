package com.example.tbao.Pojo;

import java.io.Serializable;

public class CommidityType implements Serializable {
    private Integer id;
    private String name;
    private Integer state;

    public CommidityType() {
    }

    public CommidityType(String name, Integer state) {
        this.name = name;
        this.state = state;
    }

    public CommidityType(Integer id, String name, Integer state) {
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
        return "CommidityType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
