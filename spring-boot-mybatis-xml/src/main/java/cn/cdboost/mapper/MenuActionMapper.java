package cn.cdboost.mapper;

import cn.cdboost.entity.MenuAction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuActionMapper {
    int deleteByPrimaryKey(Long actionid);

    int insert(MenuAction record);

    int insertSelective(MenuAction record);

    MenuAction selectByPrimaryKey(Long actionid);

    int updateByPrimaryKeySelective(MenuAction record);

    int updateByPrimaryKey(MenuAction record);

    // 获取所有的数据
    List<MenuAction> getAllMenuAction();
}