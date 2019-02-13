package com.slon.hilleltest.exception;

public class AppException extends RuntimeException {

  private int status;

  public AppException() {
  }

  public AppException(String message, int status) {
    super(message);
    this.status = status;
  }

  public AppException(String message, Throwable cause) {
    super(message, cause);
  }

  public int getStatus() {
    return status;
  }
}
