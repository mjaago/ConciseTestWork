package com.conciseTest.entity;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String data;

    public Data(String customData) {
        this.data = customData;
    }

    public Data() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
