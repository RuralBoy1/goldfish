package com.goldfish.goldfish.entity;

public class UserInfo {
    private String userId;
    private String userName;
    private String userPhone;
    private String userDormitory;
    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDormitory() {
        return userDormitory;
    }

    public void setUserDormitory(String userDormitory) {
        this.userDormitory = userDormitory;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
