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
public class Adress {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  private Long id;
  @ManyToOne
  @JoinColumn(name = "country_id")
  private Country country;
  @ManyToOne
  @JoinColumn(name = "city_id")
  private City city;
  @ManyToOne
  @JoinColumn(name = "street_id")
  private Street street;
}