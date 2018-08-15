package com.dust.exercises.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Configuration
@ComponentScan("com.dust.exercises.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
