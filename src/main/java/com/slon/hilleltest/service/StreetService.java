package com.slon.hilleltest.service;

import com.slon.hilleltest.exception.AppException;
import com.slon.hilleltest.model.Street;
import com.slon.hilleltest.repository.StreetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StreetService {

  @Autowired
  private StreetRepository streetRepository;

  public Street getStreet(String streetName) {
    return streetRepository.getByName(streetName)
        .orElseThrow(() -> new AppException("Street doesn't exist.", 406));
  }
}
