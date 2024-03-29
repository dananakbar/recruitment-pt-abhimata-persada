package com.example.be.model;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "users", 
  uniqueConstraints = { 
    @UniqueConstraint(columnNames = "username"),
  })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String username;

  @NonNull
  private String password;

  public User() {}

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}


