package com.dust.exercises.copy;


import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;

/**
 * @author zhaohongyang
 * @version 1.0
 * @className TestBean
 * @date 2018/11/21 15:55
 * @description //TODO
 * @program exercises-springboot
 */
public class TestBean implements Serializable{
    private TestBean1 testBean1;

    public TestBean1 getTestBean1() {
        return testBean1;
    }

    public void setTestBean1(TestBean1 testBean1) {
        this.testBean1 = testBean1;
    }

    public static void main(String[] args) {
        TestBean testBean = new TestBean();
        testBean.setTestBean1(new TestBean1());
//        TestBean clone = (TestBean)testBean.clone();
//        TestBean clone = (TestBean)SerializationUtils.clone(testBean);
        String json = JSON.toJSONString(testBean);
        TestBean clone = JSON.parseObject(json, TestBean.class);
        System.out.println(testBean);
        System.out.println(clone);
        System.out.println(testBean.getTestBean1());
        System.out.println(clone.getTestBean1());

    }

}
