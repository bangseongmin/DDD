package com.example.ddd.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Getter private String zipCode;
    @Getter private String address1;
    @Getter private String address2;

}
