package com.m.m_actuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 13:38
 * @description: 自定义健康检查
 */
@Component
public class MyHealthCheck extends AbstractHealthIndicator{
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        int checkCode = new Random().nextInt();
        if (checkCode % 2 == 0){
            builder.withDetail("t","ou").up();
        }else {
            builder.withDetail("f","ji").down();
        }
    }
}
