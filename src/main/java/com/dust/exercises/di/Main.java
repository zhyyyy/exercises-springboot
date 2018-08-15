package com.dust.exercises.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("注入成功"));
        annotationConfigApplicationContext.close();
    }
}
