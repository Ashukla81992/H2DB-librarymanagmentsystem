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
public class BorrowEntity {

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "BookId")
  private long bookId;

  @Column(name = "BorrowedDate")
  private long borrowedDate;

  @Column(name = "IsActive")
  private boolean isActive;

  @Column
  private long maxBorrowedDays;

}
