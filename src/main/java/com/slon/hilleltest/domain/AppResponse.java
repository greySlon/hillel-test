package com.slon.hilleltest.domain;

import java.util.HashMap;

public class AppResponse extends HashMap<String, Object> {

  public AppResponse(int status) {
    this.put("status", status);
  }

  public AppResponse(int status, String message) {
    this.put("status", status);
    this.put("message", message);
  }

  public AppResponse put(String key, Object value) {
    super.put(key, value);
    return this;
  }
}