package com.dust.exercises.profile;

import lombok.Data;

/**
 * Created by zhaohongyang on 2018/8/16.
 */
@Data
public class DemoBean {

    private String content;

    DemoBean(String content) {
        super();
        this.content = content;
    }
}
