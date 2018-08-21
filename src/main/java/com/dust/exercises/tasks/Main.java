package com.dust.exercises.tasks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
    }
}
