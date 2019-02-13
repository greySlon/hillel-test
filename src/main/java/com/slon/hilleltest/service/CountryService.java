package com.slon.hilleltest.service;

import com.slon.hilleltest.exception.AppException;
import com.slon.hilleltest.model.Country;
import com.slon.hilleltest.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired
  private CountryRepository countryRepository;

  public Country getCountry(String countryName) {
    return countryRepository.findByName(countryName)
        .orElseThrow(() -> new AppException("Country doesn't exist.", 406));
  }
}
