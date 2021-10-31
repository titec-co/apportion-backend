package com.titec.apportion.controller.payment;

import com.titec.apportion.common.model.payment.Payment;
import com.titec.apportion.common.model.payment.PaymentReason;
import com.titec.apportion.common.model.payment.PaymentStatus;
import com.titec.apportion.common.model.payment.PaymentType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/register/ipg")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Payment> registerIPGPayment(IPGPaymentRequest ipgPaymentRequest) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.IPG);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/reject/ipg/{paymentId}")
    public Mono<Payment> rejectIPGPayment(@PathVariable UUID paymentId) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.IPG);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/register/pos")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Payment> registerPOSPayment(POSPaymentRequest posPaymentRequest) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.POS);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/reject/pos/{paymentId}")
    public Mono<Payment> rejectPOSPayment(@PathVariable UUID paymentId) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.POS);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/register/transferToAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Payment> registerTransferToAccountPayment(TransferToAccountPaymentRequest transferToAccountPaymentRequest) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.REGISTERED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.TRANSFER_TO_ACCOUNT);
        return Mono.just(payment);
    }

    @PostMapping("/reject/transferToAccount/{paymentId}")
    public Mono<Payment> rejectTransferToAccountPayment(@PathVariable UUID paymentId) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.REJECTED);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PatchMapping("/confirm/transferToAccount/{paymentId}")
    public Mono<Payment> confirmTransferToAccountPayment(@PathVariable UUID paymentId) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/register/directWithdrawal")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Payment> registerDirectWithdrawalPayment(DirectWithdrawalPaymentRequest directWithdrawalPaymentRequest) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.DIRECT_WITHDRAWAL);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    @PostMapping("/reject/directWithdrawal/{paymentId}")
    public Mono<Payment> rejectDirectWithdrawalPayment(@PathVariable UUID paymentId) {
        Payment payment = new Payment();
        payment.setStatus(PaymentStatus.CONFIRMED);
        payment.setReason(PaymentReason.DEPOSIT_ORDER_AMOUNT);
        payment.setSettlementType(null);
        payment.setPaymentType(PaymentType.DIRECT_WITHDRAWAL);
        verifyOrderStatus();
        return Mono.just(payment);
    }

    private void verifyOrderStatus() {
        //get sum of confirmed payments for order
        //check merchant.calculatePaymentFromPayableAmount
        // compare amount by sum of payments
        // if sum of payments equal amount update order status to PAID_WITH_CONFIRM or REGISTERED
    }
}
