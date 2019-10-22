package com.example.librarymanagmentsystem.dao;

import com.example.librarymanagmentsystem.daoEntity.FineEntity;
import com.example.librarymanagmentsystem.daoEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FineDao extends JpaRepository<FineEntity, Long> {

}
