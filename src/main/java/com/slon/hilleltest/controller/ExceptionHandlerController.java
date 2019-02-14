package com.slon.hilleltest.controller;

import com.slon.hilleltest.domain.AppResponse;
import com.slon.hilleltest.exception.AppException;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@ControllerAdvice
@RestController
public class ExceptionHandlerController {

  @ExceptionHandler(value = {AppException.class})
  public AppResponse exceptionHandler(AppException ex) {
    String message = ex.getMessage();
    int status = ex.getStatus();
    return new AppResponse(status, message);
  }

  @ExceptionHandler(value = {MethodArgumentNotValidException.class})
  public AppResponse exceptionHandler(MethodArgumentNotValidException ex) {
    String message = ex.getBindingResult().getAllErrors().stream()
        .map(er -> er.getDefaultMessage())
        .collect(Collectors.joining("; "));
    return new AppResponse(400, message);
  }
}
