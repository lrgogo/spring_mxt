package com.mxt.mxt.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/1.
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
