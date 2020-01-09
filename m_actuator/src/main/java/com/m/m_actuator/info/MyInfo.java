package com.m.m_actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 15:10
 * @description: 自定义info
 */
@Component
public class MyInfo implements InfoContributor{
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("key","value").build();
    }
}
