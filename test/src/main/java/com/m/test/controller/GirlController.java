package com.m.test.controller;

import com.test.gril.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/7 15:51
 * @description: TODO
 */
@RestController
public class GirlController {

    @Autowired
    private Girl girl;

    @GetMapping("/girl")
    public String getGirl(){
        return girl.introduce();
    }

}
