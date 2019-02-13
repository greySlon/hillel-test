CREATE TABLE adress
(
  id         BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  city_id    BIGINT NOT NULL,
  country_id BIGINT NOT NULL,
  street_id  BIGINT NOT NULL
);

CREATE TABLE city
(
  id   BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE country
(
  id   BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE street
(
  id   BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE user
(
  id         BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  first_name VARCHAR(255) NULL,
  last_name  VARCHAR(255) NULL,
  adress_id  BIGINT       NOT NULL
);