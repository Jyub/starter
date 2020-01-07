package com.test.girl;

import com.test.gril.Girl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/7 15:26
 * @description: TODO
 */
@Configuration
@EnableConfigurationProperties(GirlProperties.class)
public class GirlAutoConfigure {

    @Bean
    public Girl getGirl(GirlProperties properties){
        Girl girl = new Girl();
        girl.setAge(properties.getAge());
        girl.setName(properties.getName());
        girl.setHeight(properties.getHeight());
        return girl;
    }
}
