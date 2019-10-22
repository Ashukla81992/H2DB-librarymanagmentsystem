package com.example.librarymanagmentsystem.responseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {


  long userId;
  String userName;
  String createdDate;
  boolean isMembershipActive;

  @Override
  public String toString() {
    return "UserRequest{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        ", createdDate='" + createdDate + '\'' +
        ", isMembershipActive=" + isMembershipActive +
        '}';
  }
}
