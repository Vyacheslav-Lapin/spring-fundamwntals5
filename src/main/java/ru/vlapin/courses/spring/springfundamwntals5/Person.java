package ru.vlapin.courses.spring.springfundamwntals5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
class Person {
	@Builder.Default
	Long id = 1L;

	String name;

	Country country;

	int age;
	double height;
	boolean isProgrammer;

	@Singular
  List<String> contacts;
}
