package com.example.Buyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Buyer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String  mobile;
    private String community_name;
    private String Address;
    private String no_of_households;


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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNo_of_households() {
        return no_of_households;
    }

    public void setNo_of_households(String no_of_households) {
        this.no_of_households = no_of_households;
    }
}
