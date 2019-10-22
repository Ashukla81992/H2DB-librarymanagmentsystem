package com.example.librarymanagmentsystem;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarymanagmentsystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(LibrarymanagmentsystemApplication.class, args);
  }
}
