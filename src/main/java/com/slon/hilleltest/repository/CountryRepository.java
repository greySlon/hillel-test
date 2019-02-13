package com.slon.hilleltest.repository;

import com.slon.hilleltest.model.Country;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

  Optional<Country> findByName(String countryName);
}
