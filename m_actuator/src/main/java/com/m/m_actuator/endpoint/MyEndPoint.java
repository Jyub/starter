package com.m.m_actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 11:45
 * @description: 自定义端点
 */
@Component
@Endpoint(id="myEndPoint")
public class MyEndPoint {

    private String name = "default";

    @ReadOperation
    public String getName() {
        return "{\"name\":\""+name+"\"}";
    }

    @WriteOperation
    public void setName(@Selector String name) {
        this.name = name;
    }

    @DeleteOperation
    public void delete(){
        name = "";
    }
}
