package com.polar.android.alphadog.domain.model;

/**
 * Class that represents a User in the domain layer.
 */
public class User {
    private final int userId;

    public User(int userId) {
        this.userId = userId;
    }

    private String fullname;
    private String userName;
    private String avatar;
    private int friendsCount;
    private int petsCount;

    public int getUserId() {
        return userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public int getPetsCount() {
        return petsCount;
    }

    public void setPetsCount(int petsCount) {
        this.petsCount = petsCount;
    }
}
