package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTests;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

class PayServiceTest extends PayApplicationTests {

    @Autowired
    PayServiceImpl payService;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    void create() {
        payService.create("3200296", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }


    @Test
    public void senMQMessage(){
        amqpTemplate.convertAndSend("payNotify","Hello");
    }

}