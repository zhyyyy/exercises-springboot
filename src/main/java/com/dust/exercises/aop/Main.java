package com.dust.exercises.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService = annotationConfigApplicationContext.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotationService = annotationConfigApplicationContext.getBean(DemoAnnotationService.class);
        demoMethodService.add();
        demoAnnotationService.add();
        annotationConfigApplicationContext.close();
    }
}
