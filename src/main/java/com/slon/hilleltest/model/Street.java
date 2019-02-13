package com.slon.hilleltest.model;

import static javax.persistence.GenerationType.IDENTITY;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Street {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "name")
  private String name;
}
