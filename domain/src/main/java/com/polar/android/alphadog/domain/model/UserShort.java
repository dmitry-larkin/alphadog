package com.polar.android.alphadog.domain.model;

/**
 * Class that represents a shortened User information in the domain layer.
 */
public class UserShort {
    private final int userId;

    public UserShort(int userId) {
        this.userId = userId;
    }

    private String fullName;
    private String userName;
    private String avatar;

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
