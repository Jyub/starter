package com.m.m_actuator.jmx;

import javax.management.MXBean;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 16:10
 * @description: 自定义MBean
 */
@MXBean
public interface JmxTestBean {
    String getName();
    void  setName(String name);
    String printHello();
    String printHello(String name);
}
