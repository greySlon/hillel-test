package com.slon.hilleltest.domain;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@Data
public class UserDto {

  @NotNull(message = "Firstname shouldn't be null")
  @JsonProperty(value = "firstname")
  private String firstName;
  @NotNull(message = "Lastname shouldn't be null")
  @JsonProperty(value = "lastname")
  private String lastName;
  @NotNull(message = "Country should be specified")
  @JsonProperty(value = "country")
  private String country;
  @NotNull(message = "City should be specified")
  @JsonProperty(value = "city")
  private String city;
  @NotNull(message = "Street should be specified")
  @JsonProperty(value = "street")
  private String street;
}
