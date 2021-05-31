package com.aman.practice.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

public class AddressBuild implements Serializable {

    private final int addressId;

    private final String address1;

    private final String address2;

    private final String city;

    private final int pincode;

    private AddressBuild(AddressBuilder ab) {
        this.addressId=ab.addressId;
        this.address1=ab.address1;
        this.address2=ab.address2;
        this.city=ab.city;
        this.pincode=ab.pincode;
    }

    @Override
    public String toString() {
        return "AddressBuild{" +
                "addressId=" + addressId +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public static class AddressBuilder {
        private int addressId;

        private String address1;

        private String address2;

        private String city;

        private int pincode;

        public AddressBuilder withAdressId(int addressId){
            this.addressId=addressId;
            return this;
        }
        public AddressBuilder withAdress1(String address1){
            this.address1=address1;
            return this;
        }
        public AddressBuilder withAdress2(String address2){
            this.address2=address2;
            return this;
        }
        public AddressBuilder withCity(String city){
            this.city=city;
            return this;
        }

        public AddressBuilder withPinCode(int pincode){
            this.pincode=pincode;
            return this;
        }

        public AddressBuild build(){
            AddressBuild ab = new AddressBuild(this);
            return ab;
        }

    }
}
