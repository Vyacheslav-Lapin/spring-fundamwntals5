package ru.vlapin.courses.spring.springfundamentals5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.experimental.FieldDefaults;

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
