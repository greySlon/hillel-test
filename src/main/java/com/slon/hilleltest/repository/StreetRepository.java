package com.slon.hilleltest.repository;

import com.slon.hilleltest.model.Street;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StreetRepository extends CrudRepository<Street, Long> {

  Optional<Street> getByName(String streetName);
}
