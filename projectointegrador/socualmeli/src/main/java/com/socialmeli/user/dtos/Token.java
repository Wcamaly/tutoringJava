package com.socialmeli.user.dtos;

public class Token {
  private String token;
  private int userId;
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }

  
}
