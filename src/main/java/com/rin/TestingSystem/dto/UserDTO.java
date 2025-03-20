package com.rin.TestingSystem.dto;

// định nghĩa thông tin muốn trả về cho client
public class UserDTO {
    private int id;
    private String name;
    private String addressStreet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }
}
