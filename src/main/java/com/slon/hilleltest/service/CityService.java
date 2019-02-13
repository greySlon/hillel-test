package com.slon.hilleltest.service;

import com.slon.hilleltest.exception.AppException;
import com.slon.hilleltest.model.City;
import com.slon.hilleltest.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

  @Autowired
  private CityRepository cityRepository;

  public City getCity(String cityName) {
    return cityRepository.findByName(cityName)
        .orElseThrow(() -> new AppException("City doesn't exist.", 406));
  }
}
