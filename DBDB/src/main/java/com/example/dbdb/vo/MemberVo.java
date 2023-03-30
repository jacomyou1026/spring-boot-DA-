package com.example.dbdb.vo;

import lombok.Data;

@Data
public class MemberVo {

    private String name;

    //id
    private String id;

    //phone
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
