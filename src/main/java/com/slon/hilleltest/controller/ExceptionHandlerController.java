package com.slon.hilleltest.controller;

import com.slon.hilleltest.domain.AppResponse;
import com.slon.hilleltest.exception.AppException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionHandlerController {

  @ExceptionHandler(value = {AppException.class})
  public AppResponse exceptionHandler(AppException ex) {
    String message = ex.getMessage();
    int status = ex.getStatus();
    return new AppResponse(status, message);
  }
}
