package com.example.ddd.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ShippingInfo {

    @Getter private Address address;
    @Getter private String message;
    @Getter private Receiver receiver;

    public ShippingInfo(Address address, String message, Receiver receiver) {
        this.address = address;
        this.message = message;
        this.receiver = receiver;
    }


}
