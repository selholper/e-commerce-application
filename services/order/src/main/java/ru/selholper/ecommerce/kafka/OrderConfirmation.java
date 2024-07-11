package ru.selholper.ecommerce.kafka;

import ru.selholper.ecommerce.customer.CustomerResponse;
import ru.selholper.ecommerce.order.PaymentMethod;
import ru.selholper.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}