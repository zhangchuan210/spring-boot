package cn.cd.hr.mapper;

import cn.cd.hr.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     */
    int insert(User record);

    User getByIdCardNo(String idCardNo);

}