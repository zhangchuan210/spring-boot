package cn.cd.hr.service;

import cn.cd.hr.entity.User;
import cn.cd.hr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: TODO
 * 日期:  2018-07-31 16:18
 *
 * @author: ZC
 * @since 1.0
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUser(){
        User user = userMapper.getByIdCardNo("123");
        return user;
    }


}
