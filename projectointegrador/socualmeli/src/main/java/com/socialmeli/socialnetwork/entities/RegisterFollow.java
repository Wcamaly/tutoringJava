package com.socialmeli.socialnetwork.entities;

import com.socialmeli.user.entities.User;

public class RegisterFollow {
  private int id;
  private int followAmountMe;
  private int followAmountThem;
  private User user;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getFollowAmountMe() {
    return followAmountMe;
  }
  public void setFollowAmountMe(int followAmountMe) {
    this.followAmountMe = followAmountMe;
  }
  public int getFollowAmountThem() {
    return followAmountThem;
  }
  public void setFollowAmountThem(int followAmountThem) {
    this.followAmountThem = followAmountThem;
  }
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }
  
}
