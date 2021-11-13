package com.socialmeli.user.controllers;

import com.socialmeli.user.dtos.Token;
import com.socialmeli.user.dtos.UserLoginSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class UserController {
  private static final Logger log = LoggerFactory.getLogger(UserController.class);

  public static void main(String[] args) {
    SpringApplication.run(UserController.class, args);
  }
  
 
  @PostMapping("user/login")
  Token login(@RequestBody UserLoginSession userSession){
    log.info(("Se a establecido una session"));
    return new Token();
  }

  @GetMapping("hello")
  String hello(){
    log.info(("Se a establecido una session"));
    return "Como va !!! ";
  }

}

