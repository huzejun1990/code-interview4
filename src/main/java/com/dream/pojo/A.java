package com.dream.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: huzejun
 * @Date: 2024/10/31 21:04
 */

@Component
public class A {
    @Autowired
    private B b;
}
