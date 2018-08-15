package com.dust.exercises.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
