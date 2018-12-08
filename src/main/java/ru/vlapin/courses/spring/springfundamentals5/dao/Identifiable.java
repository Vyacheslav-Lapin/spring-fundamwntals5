package ru.vlapin.courses.spring.springfundamentals5.dao;

public interface Identifiable<ID extends Number> {

  ID getId();

  Identifiable<ID> setId(ID id);
}
