package com.dust.exercises.aop;

import org.springframework.stereotype.Service;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Service
public class DemoAnnotationService {

    //自定义注解中的自定义方法
    @Action(customName="注解拦截的add操作")
    public void add(){

    }
}
