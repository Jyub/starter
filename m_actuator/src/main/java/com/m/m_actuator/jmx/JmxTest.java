package com.m.m_actuator.jmx;

import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 16:11
 * @description: 实现
 */
@ManagedResource
@Component
public class JmxTest implements JmxTestBean{

    private String name = "d";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printHello() {
        return "Hello "+name;
    }

    @Override
    public String printHello(String wName) {
        return "hello "+wName;
    }
}
