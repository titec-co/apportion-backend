package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.payment.PaymentType;
import lombok.Data;

import java.util.List;

@Data
public class Order extends AbstractEntity {

    private String orderNumber;
    private String description;
    private Merchant merchant;
    private OrderStatus status;
    private Long amount;
    private Long payableAmount;
    private String callbackUrl;
    private String paymentRedirectUrl;
    private Object allowableCards;
    private List<OrderShare> orderShares; // if is null from merchant share holders be created.
}
