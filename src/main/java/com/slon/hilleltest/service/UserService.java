package com.slon.hilleltest.service;

import com.slon.hilleltest.domain.AppResponse;
import com.slon.hilleltest.domain.UserDto;
import com.slon.hilleltest.exception.AppException;
import com.slon.hilleltest.model.Adress;
import com.slon.hilleltest.model.User;
import com.slon.hilleltest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private AdressService adressService;
  @Value("${app.message.user.created}")
  private String temlate;
  @Value("${app.message.user.exist}")
  private String temlate2;
  @Value("${app.message.user.not-exist}")
  private String temlate3;

  public AppResponse addUser(UserDto userDto) {
    String countryName = userDto.getCountry();
    String cityName = userDto.getCity();
    String streetName = userDto.getStreet();
    String firstName = userDto.getFirstName();
    String lastName = userDto.getLastName();
    Optional<User> userOptional = findUser(firstName, lastName);
    if (userOptional.isPresent()) {
      String message = MessageFormat.format(temlate2, firstName, lastName);
      throw new AppException(message, 204);
    }
    Adress adress = adressService.getAdress(countryName, cityName, streetName);
    userRepository.save(new User(firstName, lastName, adress));
    String message = MessageFormat.format(temlate, firstName, lastName);
    return new AppResponse(201, message);
  }

  public AppResponse getUser(String firstName, String lastName) {
    User user = this.findUser(firstName, lastName)
        .orElseThrow(
            () -> new AppException(MessageFormat.format(temlate3, firstName, lastName), 204));

    Adress adress = user.getAdress();
    return new AppResponse(200)
        .put("firstname", firstName)
        .put("lastname", lastName)
        .put("country", adress.getCountry().getName())
        .put("city", adress.getCity().getName())
        .put("street", adress.getStreet().getName());
  }


  private Optional<User> findUser(String firstName, String lastName) {
    return userRepository.findUser(firstName, lastName);
  }
}
