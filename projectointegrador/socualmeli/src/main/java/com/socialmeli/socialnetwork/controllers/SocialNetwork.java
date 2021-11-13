package com.socialmeli.socialnetwork.controllers;

import javax.websocket.server.PathParam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SocialNetwork {
  
  @PostMapping("/folow/:id")
  void follow (@PathParam("id") String id){

  }



} 
