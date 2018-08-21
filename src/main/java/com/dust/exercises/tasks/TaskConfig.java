package com.dust.exercises.tasks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
@Configuration
@ComponentScan("com.dust.exercises.tasks")
@EnableScheduling
public class TaskConfig {
}
