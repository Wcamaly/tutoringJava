package com.socialmeli.user.repositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.socialmeli.user.entities.User;

public class UserRepository{
  private List<User> users = new ArrayList<User>();
  
  void init(){
    //TODO import json file  create users 
    User user1 = new User("Walter", "sldjaslkd", "Seller");
    users.add(user1);    
  }

  User findByIdUser(int id) {
    User user;
    Iterator<User> usersIterator = users.iterator();
    while (usersIterator.hasNext()){
      user = usersIterator.next();
      if (user.getId() == id) {
        return user;
      }
      
    }
    return null;
  }
}
