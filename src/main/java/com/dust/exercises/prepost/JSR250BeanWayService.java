package com.dust.exercises.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhaohongyang on 2018/8/15.
 */
public class JSR250BeanWayService {

    @PostConstruct
    public void init(){
        System.out.println("@JSR250-init-method");
    }

    public JSR250BeanWayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("@JSR250-destory-method");
    }
}
