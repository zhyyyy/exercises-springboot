package com.dust.exercises.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * Created by zhaohongyang on 2018/8/20.
 */
@Data
public class DemoEvent extends ApplicationEvent {
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
