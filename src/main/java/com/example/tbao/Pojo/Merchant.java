package com.example.tbao.Pojo;

import java.io.Serializable;

public class Merchant implements Serializable {
    private Integer id;
    private String name;
    private String image;
    private Integer state;
    private Integer userId;

    public Merchant() {
    }

    public Merchant(String name, String image, Integer state, Integer userId) {
        this.name = name;
        this.image = image;
        this.state = state;
        this.userId = userId;
    }

    public Merchant(Integer id, String name, String image, Integer state, Integer userId) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.state = state;
        this.userId = userId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", state=" + state +
                ", userId=" + userId +
                '}';
    }
}
