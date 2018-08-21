package com.dust.exercises.conditional;

import org.springframework.stereotype.Service;

/**
 * Created by zhaohongyang on 2018/8/21.
 */
public class MacOSListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
