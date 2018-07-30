package cn.cd.hr.controller;

import cn.cd.hr.entity.User;
import cn.cd.hr.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatis")
    public String testMybatis() {
        User user = new User();
        user.setIdCardNo("123");
        user.setUserName("aaa");
        userMapper.insert(user);

        User user1 = userMapper.getByIdCardNo("123");
        System.out.println("测试");
        return "Hello World";
    }


}