package com.imooc.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "alipay")
public class AlipayAccountConfig {
    private String appId;
    private String privateKey;
    private String aliPayPublicKey;
    private String notifyUrl;
    private String returnUrl;
}
