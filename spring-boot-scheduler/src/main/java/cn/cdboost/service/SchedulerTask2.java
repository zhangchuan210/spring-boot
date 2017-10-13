package cn.cdboost.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zc
 * @desc
 * @create 2017-10-13 09:40
 **/
@Component
public class SchedulerTask2 {

    private int count = 0;

    @Scheduled(cron="*/2 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task2 runing  "+(count++));
    }

}
