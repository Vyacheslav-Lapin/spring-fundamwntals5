package ru.vlapin.courses.spring.springfundamwntals5.aop;

import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(level = PRIVATE)
public final class CustomerBrokenException extends RuntimeException {
}
