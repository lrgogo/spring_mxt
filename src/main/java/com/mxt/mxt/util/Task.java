package com.mxt.mxt.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/1.
 */
@Component
public class Task {

    public static Random random = new Random();


    @Async
    public void doTask1() throws Exception{
        System.out.println("开始做任务1");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务1，耗时：" + (end - start));
    }

    @Async
    public void doTask2() throws Exception{
        System.out.println("开始做任务2");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务2，耗时：" + (end - start));
    }

    @Async
    public void doTask3() throws Exception{
        System.out.println("开始做任务3");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务3，耗时：" + (end - start));
    }


}
