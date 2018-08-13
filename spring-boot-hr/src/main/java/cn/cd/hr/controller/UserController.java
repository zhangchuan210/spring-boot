package cn.cd.hr.controller;

import cn.cd.hr.entity.User;
import cn.cd.hr.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatis")
    public String testMybatis() {
        User user = new User();
        user.setIdCardNo("123");
        user.setUserName("aaa");
        user.setTel("123");
        //userMapper.insert(user);

        User user1 = userMapper.getByIdCardNo("123");
        return "Hello World";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/query")
    public String query() {
        return "query";
    }

    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result, Model model) {

        userMapper.insert(user);

        return "success";
    }

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(@Valid User user, BindingResult result, Model model) {
        Map<String, Object> map = new HashMap<>();
        List<User> list = userMapper.queryUsers(user);
        model.addAttribute("users", list);

        return list;
    }
}