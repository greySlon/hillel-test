package com.slon.hilleltest.model;

import static javax.persistence.GenerationType.IDENTITY;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @ManyToOne
  @JoinColumn(name = "adress_id")
  private Adress adress;

  public User() {
  }

  public User(String firstName, String lastName, Adress adress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.adress = adress;
  }
}