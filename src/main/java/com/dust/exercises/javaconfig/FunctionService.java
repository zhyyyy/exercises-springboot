package com.dust.exercises.javaconfig;

/**
 * Created by zhaohongyang on 2018/8/14.
 * java配置练习
 */
//这里没有用@Service或@Component
public class FunctionService {

    public String sayHello(String word) {
        return "Hello" + word + "!";
    }
}
