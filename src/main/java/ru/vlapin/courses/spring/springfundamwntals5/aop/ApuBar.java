package ru.vlapin.courses.spring.springfundamwntals5.aop;

import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import ru.vlapin.courses.spring.springfundamwntals5.Person;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(level = PRIVATE)
public final class ApuBar implements Bar {

  @NotNull
  @Override
  public Squishee sellSquishee(@NotNull Person person) {
    if (person.isBroke())
      throw new CustomerBrokenException();
    return () -> "Usual Squishee";
  }
}
