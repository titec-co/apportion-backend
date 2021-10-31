package com.titec.apportion.service.order;


import com.titec.apportion.common.model.order.Order;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<Order> register(Order order);
}
