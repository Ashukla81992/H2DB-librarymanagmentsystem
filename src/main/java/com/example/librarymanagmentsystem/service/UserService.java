package com.example.librarymanagmentsystem.service;

import com.example.librarymanagmentsystem.dao.UserDao;
import com.example.librarymanagmentsystem.daoEntity.UserEntity;
import com.example.librarymanagmentsystem.requestEntities.UserRequest;
import com.example.librarymanagmentsystem.responseEntity.UserResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserDao userDao;

  public UserResponse addUser(UserRequest userRequest){
    UserEntity userEntity = new UserEntity();
    userEntity.setUserName(userRequest.getUserName());
    DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    Date date = new Date(System.currentTimeMillis());
    String dateFormate = dateFormat.format(date);
    System.out.println(dateFormate);
    userEntity.setCreatedDate(dateFormate);
    userEntity.setMembershipActive(true);
    userDao.save(userEntity);

    UserResponse userResponse = new UserResponse();
    userResponse.setCreatedDate(userEntity.getCreatedDate());
    userResponse.setMembershipActive(userEntity.isMembershipActive());
    userResponse.setUserName(userEntity.getUserName());
    userResponse.setUserId(userEntity.getUserId());
    return userResponse;
  }

  public void deleteUser(UserRequest userRequest){
    UserEntity userEntity = new UserEntity();
    userEntity.setCreatedDate(userRequest.getCreatedDate());
    userEntity.setCreatedDate(userRequest.getCreatedDate());
    userDao.delete(userEntity);
  }

}
