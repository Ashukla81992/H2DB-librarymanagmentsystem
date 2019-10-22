package com.example.librarymanagmentsystem.daoEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Inventory" )
public class InventoryEntity {

  @Id
  @GeneratedValue
  private long recordId;

  @Column(name = "bookId")
  private long bookId;

  @Column(name = "count")
  private long count;

}
