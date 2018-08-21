package com.dust.exercises.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohongyang on 2018/8/20.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println(" 执行 异步 任务: " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println(" 执行 异步 任务+ 1: " + (i + 1));
    }

}
