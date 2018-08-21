package com.dust.exercises.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统 下 的 列表 命令 为: " + listService.showListCmd());
//        System.out.println(context.getEnvironment().getProperty("os.name") + "系统 下 的 列表 命令 为: ");
    }

}
