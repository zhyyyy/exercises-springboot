package com.dust.exercises.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(" HH: mm: ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println(" 每隔 五 秒 执行 一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 06 10 ? * *")
    public void fixTimeExecution() {
        System.out.println(" 在 指定 时间 " + dateFormat.format(new Date()) + " 执行");
    }

}
