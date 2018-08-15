package com.dust.exercises.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohongyang on 2018/8/14.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
