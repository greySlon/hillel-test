package com.slon.hilleltest.repository;

import com.slon.hilleltest.model.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

  Optional<City> findByName(String cityName);
}
