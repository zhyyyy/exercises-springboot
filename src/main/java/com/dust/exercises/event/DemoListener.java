package com.dust.exercises.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhaohongyang on 2018/8/20.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println(" 我( bean- demoListener) 接收 到了 bean- demoPublisher 发布 的 消息:" + msg);
    }
}
