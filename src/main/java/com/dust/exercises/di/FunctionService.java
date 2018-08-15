package com.dust.exercises.di;

import org.springframework.stereotype.Component;

/**
 * Created by zhaohongyang on 2018/8/14.
 * 依赖注入练习
 */
//@Service
@Component
public class FunctionService {

    public String sayHello(String word) {
        return "Hello" + word + "!";
    }
}
