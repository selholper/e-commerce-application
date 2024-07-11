package ru.selholper.ecommerce.payment;

import ru.selholper.ecommerce.customer.CustomerResponse;
import ru.selholper.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
