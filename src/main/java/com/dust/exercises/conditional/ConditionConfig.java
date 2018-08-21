package com.dust.exercises.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
@Configuration
@ComponentScan("com.dust.exercises.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(MasOsCondition.class)
    public ListService macOSListService() {
        return new MacOSListService();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

}
