package com.example.librarymanagmentsystem.requestEntities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

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
