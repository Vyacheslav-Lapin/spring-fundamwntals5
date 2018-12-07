package ru.vlapin.courses.spring.springfundamwntals5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
class Country {

	@Default
	Integer id = 1;

	String name;

	String groupName;

	public Country(String name, String groupName) {
		this.name = name;
		this.groupName = groupName;
	}
}
