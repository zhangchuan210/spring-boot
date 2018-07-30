package cn.cd.hr.mapper;

import cn.cd.hr.entity.StudyInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyInfoMapper {
    /** 
     * 根据ID删除
     * @param id 主键ID
     */
    int deleteByPrimaryKey(Integer id);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     */
    int insert(StudyInfo record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     */
    int insertSelective(StudyInfo record);

    /** 
     * 根据ID查询
     * @param id 主键ID
     */
    StudyInfo selectByPrimaryKey(Integer id);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKeySelective(StudyInfo record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKey(StudyInfo record);
}