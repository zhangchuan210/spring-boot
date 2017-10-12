package cn.cdboost.mapper;

import cn.cdboost.entity.MenuAction;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MenuActionMapper {
    @Select("SELECT * FROM em_b_menuaction")
//    @Results({
//            @Result(property = "actionID", column = "actionID"),
//            @Result(property = "menuID", column = "menuID")
//            @Result(property = "actionName", column = "ActionName")
//            @Result(property = "createTime", column = "CreateTime")
//            @Result(property = "createUserID", column = "CreateUserID")
//    })
    List<MenuAction> getAllMenuAction();

    @Select("SELECT * FROM em_b_menuaction WHERE id = #{id}")
    MenuAction getOne(Long id);

}