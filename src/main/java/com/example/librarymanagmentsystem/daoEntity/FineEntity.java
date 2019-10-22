package com.example.librarymanagmentsystem.daoEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "Books")
public class FineEntity {

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "UserId")
  private long userId;

  @Column(name = "FineAmount")
  private double fineAmount;

}
