package com.dust.exercises.aop;

import java.lang.annotation.*;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String customName();
}
