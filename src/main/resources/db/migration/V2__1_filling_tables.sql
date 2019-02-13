INSERT INTO country (id, name) VALUES (1, 'Ukraine');
INSERT INTO country (id, name) VALUES (2, 'Germany');
INSERT INTO country (id, name) VALUES (3, 'Canada');
INSERT INTO country (id, name) VALUES (4, 'USA');

INSERT INTO city (id, name) VALUES (1, 'Odessa');
INSERT INTO city (id, name) VALUES (2, 'Kyev');
INSERT INTO city (id, name) VALUES (3, 'Lviv');
INSERT INTO city (id, name) VALUES (4, 'Munich');
INSERT INTO city (id, name) VALUES (5, 'Toronto');
INSERT INTO city (id, name) VALUES (6, 'LA');


INSERT INTO street (id, name) VALUES (1, 'Kanatnaya');
INSERT INTO street (id, name) VALUES (2, 'Zhukovskogo');
INSERT INTO street (id, name) VALUES (3, 'Aleksandrovsky blvd');
INSERT INTO street (id, name) VALUES (4, '23');
INSERT INTO street (id, name) VALUES (5, '35');
INSERT INTO street (id, name) VALUES (6, 'Volf Shtrasen');
INSERT INTO street (id, name) VALUES (7, 'Norvich');
INSERT INTO street (id, name) VALUES (8, 'West Road');
INSERT INTO street (id, name) VALUES (9, 'Shevchenko');
INSERT INTO street (id, name) VALUES (10, 'Bunina');
INSERT INTO street (id, name) VALUES (11, 'Volodymyrivskyi uzviz');
INSERT INTO street (id, name) VALUES (12, 'Centralnyi uzviz');


INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 1, 1);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 1, 2);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 1, 3);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 1, 9);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 1, 10);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 2, 2);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 2, 11);
INSERT INTO adress (country_id, city_id, street_id) VALUES (1, 3, 12);
INSERT INTO adress (country_id, city_id, street_id) VALUES (2, 4, 6);
INSERT INTO adress (country_id, city_id, street_id) VALUES (2, 4, 7);
INSERT INTO adress (country_id, city_id, street_id) VALUES (3, 5, 8);
INSERT INTO adress (country_id, city_id, street_id) VALUES (4, 6, 4);
INSERT INTO adress (country_id, city_id, street_id) VALUES (4, 6, 5);
INSERT INTO adress (country_id, city_id, street_id) VALUES (4, 6, 8);