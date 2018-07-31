package cn.cd.hr.mapper;

import cn.cd.hr.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
    /** 
     * 根据ID删除
     * @param id 主键ID
     */
    int deleteByPrimaryKey(Integer id);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     */
    int insert(UserInfo record);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKeySelective(UserInfo record);

}