package com.dust.exercises.javaconfig;


/**
 * Created by zhaohongyang on 2018/8/14.
 */
//@Service
public class UseFunctionService {

    //    @Autowired
//    @Resource
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
