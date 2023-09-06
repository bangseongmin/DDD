package com.example.ddd.domain;

import com.example.ddd.constant.OrderState;

public class Order {

    private OrderState state;
    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        if(!this.state.isShippingChangeable()) {
            throw new IllegalStateException("Can't change shipping in " + state);
        }

        this.shippingInfo = newShippingInfo;
    }
}
