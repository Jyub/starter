package com.m.m_actuator.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 14:30
 * @description: 自定义监控
 */
@Component
public class MyMetrics {
    private final List<String> list = new ArrayList<>();

    public MyMetrics(MeterRegistry registry) {
        registry.gaugeCollectionSize("list.size", Tags.empty(),this.list);
    }
}
