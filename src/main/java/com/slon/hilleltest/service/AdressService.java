package com.slon.hilleltest.service;

import com.slon.hilleltest.exception.AppException;
import com.slon.hilleltest.model.Adress;
import com.slon.hilleltest.model.City;
import com.slon.hilleltest.model.Country;
import com.slon.hilleltest.model.Street;
import com.slon.hilleltest.repository.AdressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressService {

  @Autowired
  private AdressRepository adressRepository;
  @Autowired
  private CountryService countryService;
  @Autowired
  private CityService cityService;
  @Autowired
  private StreetService streetService;

  public Adress getAdress(String countryName, String cityName, String streetName) {
    Country country = countryService.getCountry(countryName);
    City city = cityService.getCity(cityName);
    Street street = streetService.getStreet(streetName);
    return adressRepository.getAdress(country, city, street)
        .orElseThrow(() -> new AppException("Adress doesn't exist.", 406));
  }
}
