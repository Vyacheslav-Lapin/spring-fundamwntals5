package ru.vlapin.courses.spring.springfundamentals5;

import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.vlapin.courses.spring.springfundamentals5.aop.Bar;
import ru.vlapin.courses.spring.springfundamentals5.aop.CustomerBrokenException;

import static lombok.AccessLevel.PRIVATE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@FieldDefaults(level = PRIVATE)
@ExtendWith(SpringExtension.class)
//@AllArgsConstructor(onConstructor = @__(@Autowired))
class SpringFundamentals5ApplicationTest { //for ru.vlapin.courses.spring.springfundamwntals5.SpringFundamentals5Application

  @Autowired
  Person vasyaPupkin;

  @Autowired
  Person ivanIvanov;

  @Autowired
  Bar bar;

  @Test
  @SneakyThrows
  @DisplayName("UsualPerson injects correctly")
  void testName() {
    assertThat(vasyaPupkin.getName()).isEqualTo("Вася Пупкин");
    assertThat(ivanIvanov.getName()).isEqualTo("Ivan Ivanov");
  }

  @Test
  @SneakyThrows
  @DisplayName("\"AOP\" methods works correctly")
  void testAOP() {

    // when
    String correctOut = TestUtils.fromSystemOutPrintln(() ->
        assertThat(bar.sellSquishee(vasyaPupkin).getName())
            .isEqualTo("Usual Squishee"));

    String errorContainingOut = TestUtils.fromSystemOutPrintln(() ->
        assertThrows(CustomerBrokenException.class, () ->
            bar.sellSquishee(ivanIvanov)));

    // then
    assertThat(correctOut)
        .isEqualTo("Hi!\n" +
            "Hello, Вася Пупкин. How are you doing?\n" +
            "See you!\n" +
            "Good bye!\n" +
            "Is Usual Squishee good enough?"
        );

    assertThat(errorContainingOut)
        .isEqualTo("Hi!\n" +
            "Hello, Ivan Ivanov. How are you doing?\n" +
            "Good bye!\n" +
            "Hmmmmmm...");

  }
}