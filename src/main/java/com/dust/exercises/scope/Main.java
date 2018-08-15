package com.dust.exercises.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService demoPrototypeService = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService1 = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        DemoSingletonService demoSingletonService = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService1 = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        System.out.println("Prototype:" + demoPrototypeService.equals(demoPrototypeService1));
        System.out.println("Singleton:" + demoSingletonService.equals(demoSingletonService1));
    }
}
