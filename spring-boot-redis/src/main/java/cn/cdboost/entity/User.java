package cn.cdboost.entity;

import java.io.Serializable;

/**
 * @author zc
 * @desc
 * @create 2017-10-11 10:37
 **/
public class User implements Serializable{
    private static final long serialVersionUID = 7247714666080613254L;

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
