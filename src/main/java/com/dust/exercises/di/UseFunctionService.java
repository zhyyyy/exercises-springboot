package com.dust.exercises.di;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Service
public class UseFunctionService {

    //    @Autowired
    @Resource
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
