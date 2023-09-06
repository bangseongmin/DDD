package com.example.ddd.domain;

import com.example.ddd.constant.OrderState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Getter @Setter
    private OrderState state;

    @Getter
    private ShippingInfo shippingInfo;

    @Getter
    private List<OrderLine> orderLines;

    @Getter @Setter
    private Money totalAmounts;

    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo == null) {
            throw new IllegalStateException("no ShippingInfo");
        }

        this.shippingInfo = shippingInfo;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLeastOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void calculateTotalAmounts() {
        int sum = orderLines.stream()
                .mapToInt(OrderLine::getAmounts)
                .sum();

        this.totalAmounts = new Money(sum);
    }

    private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if(orderLines == null || orderLines.isEmpty()) {
            throw new IllegalStateException("no OrderLine");
        }
    }

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        if(!this.state.isShippingChangeable()) {
            throw new IllegalStateException("Can't change shipping in " + state);
        }

        this.shippingInfo = newShippingInfo;
    }
}
