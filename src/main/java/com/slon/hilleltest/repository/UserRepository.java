package com.slon.hilleltest.repository;

import com.slon.hilleltest.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  @Query("select u from User u where u.firstName =?1 and u.lastName =?2")
  Optional<User> findUser(String firstName, String lastName);
}
