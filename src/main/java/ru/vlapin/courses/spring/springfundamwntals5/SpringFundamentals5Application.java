package ru.vlapin.courses.spring.springfundamwntals5;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@SpringBootApplication
public class SpringFundamentals5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentals5Application.class, args);
	}

	@Bean
	Country russia() {
	    return new Country("Россия", "RU");
	}
	
	@Bean
	Person person(Country russia) {
	    return Person.builder()
					.name("Вася Пупкин")
					.age(15)
					.contact("222-33-22")
					.contact("kljhdg@sdfg.ru")
					.height(1.78)
					.country(russia)
					.build();
	} 
}

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
class Country {

	Integer id;

	String name;

	String groupName;

	public Country(String name, String groupName) {
		this.name = name;
		this.groupName = groupName;
	}
}

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
class Person {
	Long id;

	String name;

	Country country;

	int age;
	double height;
	boolean isProgrammer;

	@Singular
	List<String> contacts;
}
