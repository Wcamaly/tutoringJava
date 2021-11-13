package com.socialmeli.user.entities;

public class User {
  private int id;
  private String username;
  private String password;
  private String type;
  private Person person;
  
  public User(String username, String password, String type) {
    this.username = username;
    this.password = password;
    this.type = type;
  }


  public String getUsername() {
    return username;
  }
  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }


  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
}
