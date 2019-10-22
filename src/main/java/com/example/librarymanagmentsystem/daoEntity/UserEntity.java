package com.example.librarymanagmentsystem.daoEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table ( name = "Books")
public class UserEntity {

  @Id
  @GeneratedValue
  private long userId;

  @Column(name = "UserName")
  private String userName;

  @Column(name = "CreatedDate")
  private String createdDate;

  @Column(name = "IsMembershipActive")
  private boolean isMembershipActive;

}
