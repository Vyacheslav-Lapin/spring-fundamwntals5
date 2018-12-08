package ru.vlapin.courses.spring.springfundamentals5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import ru.vlapin.courses.spring.springfundamentals5.dao.Identifiable;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@AllArgsConstructor
@FieldNameConstants
@FieldDefaults(level = PRIVATE)
public class Country implements Identifiable<Integer> {

	Integer id;

	String name;

	String groupName;

	public Country(String name, String groupName) {
		this.name = name;
		this.groupName = groupName;
	}
}
