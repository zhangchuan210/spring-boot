package cn.cdboost.controller;

import cn.cdboost.entity.MenuAction;
import cn.cdboost.mapper.MenuActionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);

    @Autowired
    private MenuActionMapper menuActionMapper;


    @RequestMapping("/mybatis")
    public String testRedis() {

        List<MenuAction> list = menuActionMapper.getAllMenuAction();
        logger.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("测试");
        return "Hello World";
    }


}