package cn.cdboost.entity;

import java.io.Serializable;
import java.util.Date;

public class MenuAction implements Serializable {
    private static final long serialVersionUID = 7247714666080613214L;
    private Long actionID;
    private Long menuID;
    private String actionName;
    private Date createTime;
    private Long createUserID;

    public Long getActionID() {
        return actionID;
    }
    public void setActionID(Long actionID) {
        this.actionID = actionID;
    }
    public String getActionName() {
        return actionName;
    }
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Long getMenuID() {
        return menuID;
    }
    public void setMenuID(Long menuID) {
        this.menuID = menuID;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Long getCreateUserID() {
        return createUserID;
    }
    public void setCreateUserID(Long createUserID) {
        this.createUserID = createUserID;
    }

    @Override
    public String toString() {
        return "MenuAction [actionID=" + actionID + ", actionName=" + actionName + ", menuID=" + menuID
                + ", createTime=" + createTime + ", createUserID=" + createUserID + "]";
    }

}