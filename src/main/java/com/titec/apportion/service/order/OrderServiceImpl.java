package com.titec.apportion.service.order;

import com.titec.apportion.common.model.order.Order;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Mono<Order> register(Order orderData) {
        Order order = new Order();
        order.setId(UUID.randomUUID());
        order.setOrderNumber(orderData.getOrderNumber());
        order.setAmount(orderData.getAmount());
        order.setCallbackUrl(orderData.getCallbackUrl());
        return Mono.just(order);
    }
}
