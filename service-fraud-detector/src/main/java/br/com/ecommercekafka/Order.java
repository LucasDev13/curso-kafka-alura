package br.com.ecommercekafka;

import java.math.BigDecimal;

public class Order {
    final String userId, orderId;
    final BigDecimal amount;

    public Order(String userId, String orderId, BigDecimal amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }
}
