package com.dust.exercises.el;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohongyang on 2018/8/15.
 */
@Service
@Data
public class DemoService {

    @Value("其他类的属性")
    private String anthor;

}
