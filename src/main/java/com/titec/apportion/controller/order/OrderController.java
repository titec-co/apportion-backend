package com.titec.apportion.controller.order;

import com.titec.apportion.common.model.order.Order;
import com.titec.apportion.common.model.payment.Payment;
import com.titec.apportion.controller.data.PagingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public Order register(OrderRegisterRequest orderRegisterRequest) {
        return null;
    }

    @GetMapping("/inquiry/{orderId}")
    public Order inquiryById(@PathVariable UUID orderId) {
        return null;
    }

    @PostMapping("/inquiry")
    public PagingResult<Order> inquiryByCriteria(OrderSearchCriteriaRequest criteria) {
        return null;
    }

    @PostMapping("/settlement/transfer-to-account")
    public Payment registerSettlementByTransferToAccount(OrderSettlementRequest orderSettlementRequest) {
        // payment must be save with status registered
        return null;
    }

    @PatchMapping("/settlement/transfer-to-account/confirm/{orderId}/{paymentId}")
    public void confirmSettlementByTransferToAccount(@PathVariable UUID orderId, @PathVariable UUID paymentId) {
        // change payment status
    }

    @PostMapping("/apportion/submit/{orderId}")
    public void submitApportionRequest(@PathVariable UUID orderId) {

    }

}
