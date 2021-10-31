package com.titec.apportion.controller.order;

import com.titec.apportion.common.model.order.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
@AutoConfigureWebTestClient
@ActiveProfiles("test")
@Slf4j
class OrderControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void register() {
        webTestClient.post().uri("/order")
                .body(Mono.just(new OrderRegisterRequest()), OrderRegisterRequest.class)
                .exchange().expectStatus().isCreated()
                .expectBody(Order.class)
                .consumeWith(entity -> {
                    Order order = entity.getResponseBody();
                    assertNotNull(order.getId());
                });
    }
}