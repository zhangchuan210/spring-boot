package cn.cd.hr.test;

import cn.cd.hr.Application;
import cn.cd.hr.entity.User;
import cn.cd.hr.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 描述: TODO
 * 日期:  2018-07-31 14:26
 *
 * @author: ZC
 * @since 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = Application.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void test() throws Exception {
        User user = userService.getUser();
        System.out.println(user);

    }
}
