package com.slon.hilleltest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import com.slon.hilleltest.domain.AppResponse;
import com.slon.hilleltest.domain.UserDto;
import com.slon.hilleltest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/userinfo")
public class UserInfoController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/add", method = PUT)
  public AppResponse addUser(@Valid @RequestBody UserDto userDto) {
    return userService.addUser(userDto);
  }

  @RequestMapping(value = "/get/{firstname}/{lastname}", method = GET)
  public AppResponse getUser(
      @PathVariable("firstname") String firstName,
      @PathVariable("lastname") String lastName) {
    return userService.getUser(firstName, lastName);
  }
}