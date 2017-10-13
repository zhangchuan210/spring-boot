package cn.cdboost.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zc
 * @desc
 * @create 2017-10-13 09:40
 **/
@Component
public class SchedulerTask1 {

    private int count = 0;

    @Scheduled(cron="*/1 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task1 runing  "+(count++));
    }

}
