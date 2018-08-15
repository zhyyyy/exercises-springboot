package com.dust.exercises.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//        FunctionService functionService = annotationConfigApplicationContext.getBean(FunctionService.class);
        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java配置成功"));
        annotationConfigApplicationContext.close();
    }
}
