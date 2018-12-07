package ru.vlapin.courses.spring.springfundamentals5.aop;

import ru.vlapin.courses.spring.springfundamentals5.Person;

@FunctionalInterface
public interface Bar {

  Squishee sellSquishee(Person person);
}
