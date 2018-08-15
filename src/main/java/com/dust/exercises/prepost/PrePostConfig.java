package com.dust.exercises.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaohongyang on 2018/8/15.
 */
@Configuration
@ComponentScan("com.dust.exercises.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250BeanWayService jsr250WayService() {
        return new JSR250BeanWayService();
    }

}
