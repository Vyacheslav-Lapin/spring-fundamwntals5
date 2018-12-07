package ru.vlapin.courses.spring.springfundamwntals5;

public interface Person {
  Long getId();

  String getName();

  Country getCountry();

  int getAge();

  double getHeight();

  boolean isProgrammer();

  boolean isBroke();

  java.util.List<String> getContacts();
}
