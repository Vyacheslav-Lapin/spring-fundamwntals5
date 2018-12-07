package ru.vlapin.courses.spring.springfundamentals5.aop;

import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.vlapin.courses.spring.springfundamentals5.Person;

import static lombok.AccessLevel.PRIVATE;

@Component
@FieldDefaults(level = PRIVATE)
public class ApuBar implements Bar {

  @Polite
  @NotNull
  @Congrats
  @Override
  @BrokeProof
  @GoodByeble
  @FeedBackNeeded
  public Squishee sellSquishee(@NotNull Person person) {
    if (person.isBroke())
      throw new CustomerBrokenException();
    return () -> "Usual Squishee";
  }
}
