package com.example.librarymanagmentsystem.dao;

import com.example.librarymanagmentsystem.daoEntity.BorrowEntity;
import com.example.librarymanagmentsystem.daoEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowDao extends JpaRepository<BorrowEntity, Long> {

}
