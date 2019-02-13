package com.slon.hilleltest.repository;

import com.slon.hilleltest.model.Adress;
import com.slon.hilleltest.model.City;
import com.slon.hilleltest.model.Country;
import com.slon.hilleltest.model.Street;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdressRepository extends CrudRepository<Adress, Long> {

  @Query("select a from Adress a where a.country = ?1 and a.city =?2 and a.street =?3")
  Optional<Adress> getAdress(Country country, City city, Street street);
}
