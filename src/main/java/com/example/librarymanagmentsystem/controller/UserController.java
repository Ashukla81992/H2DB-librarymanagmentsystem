package com.example.librarymanagmentsystem.controller;

import com.example.librarymanagmentsystem.requestEntities.UserRequest;
import com.example.librarymanagmentsystem.responseEntity.UserResponse;
import com.example.librarymanagmentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping(value = "/add")
  public UserResponse addUser(@RequestBody UserRequest userRequest){
    UserResponse ur = userService.addUser(userRequest);
    String result= ("User added " + ur.toString());
    System.out.println(result);
    return ur;
  }


}
