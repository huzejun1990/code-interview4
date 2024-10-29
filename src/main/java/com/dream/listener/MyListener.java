package com.dream.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @Auther: huzejun
 * @Date: 2024/10/28 22:33
 */
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // ApplicationEvent event 对应的就是该事件，ApplicationReadyEvent.ApplicationFailedEvent
        if (event instanceof ApplicationReadyEvent) {
            //容器初始化成功
            System.out.println("MyListener...容器初始化成功...");
        }

        if (event instanceof ApplicationFailedEvent) {
            //容器初始化失败
            System.out.println("MyListener...容器初始化失败...");
        }
    }
}
