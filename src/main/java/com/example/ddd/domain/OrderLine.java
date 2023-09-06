package com.example.ddd.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {

    @Getter private Product product;
    @Getter private int price;
    @Getter private int quantity;
    @Getter private int amounts;
}
