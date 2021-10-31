package com.titec.apportion.controller.order;

import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.order.*;
import com.titec.apportion.common.model.payment.Payment;
import com.titec.apportion.controller.data.PagingResult;
import com.titec.apportion.service.order.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Order> register(OrderRegisterRequest orderRegisterRequest) {

//        Order order = null; // generate from orderRegisterRequest
//        order.setPaymentRedirectUrl(null);// from merchant ipg settings (apportion-ui)
//        Merchant merchant = order.getMerchant();
//        boolean needConfirm = merchant.getSettlementNeedConfirm();
//
//        LocalDateTime wageSettlementTime = null; //needConfirm,merchant.allowCustomOrderWageSettlementTime,merchant.settlementScheduling,orderRegisterRequest.wageSettlementTime
//
//        long totalWageValue = 0;
////      prepare order wage data
//        List<OrderWage> orderWages = new ArrayList<>();
//        List<Wage> wages = findWageListByMerchant(merchant);
//        for (Iterator<Wage> iterator = wages.iterator(); iterator.hasNext(); ) {
//            Wage wage =  iterator.next();
//            OrderWage orderWage = new OrderWage();
//            orderWage.setOrder(order);
//            orderWage.setMerchant(merchant);
//            orderWage.setWage(wage);
//            long finalOrderWageValue = 0; // calculate from order.payableAmount or order.amount and wage.value
//            orderWage.setFinalWageValue(finalOrderWageValue);
//            totalWageValue = totalWageValue + finalOrderWageValue;
//            orderWage.setSettlementTime(wageSettlementTime);
//            orderWage.setStatus(SettlementStatus.REGISTERED);
//        }
//
////        check order shares
//        if (null == order.getOrderShares() || order.getOrderShares().size() < 1 ||
//                merchant.getAllowCustomOrderShareHolder()) {
////            todo replace order.orderShares from merchant order shares
////            OrderShare orderShare = iterator.next();
//        }
//
//        for (Iterator<OrderShare> iterator = order.getOrderShares().iterator(); iterator.hasNext(); ) {
//            OrderShare orderShare = iterator.next();
//            orderShare.setFinalWageValue(null); //totalWageValue,orderShare.wageFixValue,orderShare.wagePercent
//            orderShare.setFinalShareValue(null); //payableAmount,totalWageValue,orderShare.wageFixValue,orderShare.wagePercent,shareFixValue,sharePercent
//            orderShare.setSettlementTime(null);//needConfirm,orderShare.settlementTime,merchant.allowCustomOrderSettlementTime,merchant.settlementScheduling
//            orderShare.setSettlementStatus(SettlementStatus.REGISTERED);
//        }
////        if order.orderShare == null || !merchant.allowCustomOrderSettlementTime
////            calculate orderShare.settlementTime from merchant or shareHolder schedule pattern

        return orderService.register(new Order());
    }

    @GetMapping("/inquiry/{orderId}")
    public Order inquiryById(@PathVariable UUID orderId) {
        return null;
    }

    @PostMapping("/inquiry")
    public PagingResult<Order> inquiryByCriteria(OrderSearchCriteriaRequest criteria) {
        return null;
    }

//    @PostMapping("/settlement/transfer-to-account")
//    public Payment registerSettlementByTransferToAccount(OrderSettlementRequest orderSettlementRequest) {
//        // payment must be save with status registered
//        return null;
//    }
//
//    @PatchMapping("/settlement/transfer-to-account/confirm/{orderId}/{paymentId}")
//    public void confirmSettlementByTransferToAccount(@PathVariable UUID orderId, @PathVariable UUID paymentId) {
//        // change payment status
//    }


    @PostMapping("/apportion/submit/{orderId}")
    public void submitApportionRequest(@PathVariable UUID orderId) {
        //select orderShare, orderWage and set settlementTime
    }

    private List<Wage> findWageListByMerchant(Merchant merchant) {
//            first find by merchantId. if not found find null merchants;
        return null;
    }
}
