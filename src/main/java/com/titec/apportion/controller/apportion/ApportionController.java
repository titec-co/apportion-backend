package com.titec.apportion.controller.apportion;

import com.titec.apportion.common.model.order.OrderSettling;

import java.time.LocalDateTime;
import java.util.Collection;

public class ApportionController {

    //job tasks:
    // 1) call method findOrderSettlingList
    // 2) do banking or wallet service
    // 3) updateSettlingResult
    public Collection<OrderSettling> findOrderSettlingList(LocalDateTime from, LocalDateTime to) {
        return null;
    }

    public void updateSettlingResult(OrderSettling orderSettling){
        //begin transaction
//            1) insert payment from orderSettling
//            2) update orderSettling status
        //end transaction
    }
}
