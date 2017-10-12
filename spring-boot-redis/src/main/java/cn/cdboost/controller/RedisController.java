package cn.cdboost.controller;

import cn.cdboost.entity.User;
import cn.cdboost.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @desc
 * @create 2017-10-12 13:45
 **/
@RestController
public class RedisController {
    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private RedisService redisService;

    @RequestMapping("/redis")
    public String index() {

        redisService.setStr("aaa","testaaa");
        String value = redisService.getStr("aaa");
        logger.info(value);
        redisService.del("value:" + "aaa");
        boolean isStrExists = redisService.checkExists("aaa");
        logger.info("isStrExists:" + isStrExists);

        User user = new User();
        user.setUserName("测试");
        user.setPassWord("abcd");

        redisService.setObj("user", user);
        User tempUser = (User) redisService.getObj("user");
        redisService.delObj("user");
        boolean isObjExists = redisService.checkExists("user");
        logger.info("isObjExists:" + isObjExists);

        return "redis";
    }
}
