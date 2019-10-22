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
public class BookEntity {

  @Id
  @GeneratedValue
  private long bookId;

  @Column(name = "BookName")
  private String bookName;

  @Column(name = "AuthorName")
  private String authorName;

  @Column(name = "Publisher")
  private String publisher;

}
