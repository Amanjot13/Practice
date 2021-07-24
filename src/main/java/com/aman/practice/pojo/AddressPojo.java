package com.aman.practice.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressPojo implements Serializable {

    private int addressId;

    private String address1;

    private String address2;

    private String city;

    private int pincode;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
