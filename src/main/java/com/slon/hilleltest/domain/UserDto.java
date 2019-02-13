package com.slon.hilleltest.domain;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class UserDto {

  @JsonProperty(value = "firstname")
  private String firstName;
  @JsonProperty(value = "lastname")
  private String lastName;
  @JsonProperty(value = "country")
  private String country;
  @JsonProperty(value = "city")
  private String city;
  @JsonProperty(value = "street")
  private String street;
}
