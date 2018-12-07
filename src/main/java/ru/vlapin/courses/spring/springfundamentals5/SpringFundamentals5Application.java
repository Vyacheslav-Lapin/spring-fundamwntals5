package ru.vlapin.courses.spring.springfundamentals5;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@SpringBootApplication
@ImportResource("classpath:ioc.xml")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class SpringFundamentals5Application {

  Country russia;

  public static void main(String[] args) {
    SpringApplication.run(SpringFundamentals5Application.class, args);
  }

  @Bean
  Country belarus() {
    return Country.builder()
        .id(3)
        .name("Беларуссия")
        .groupName("BEL")
        .build();
  }

  @Bean
  Person vasyaPupkin(Country belarus) {
    return UsualPerson.builder()
        .id(2L)
        .name("Вася Пупкин")
        .age(17)
        .contact("222-33-22")
        .contact("kljhdg@sdfg.ru")
        .height(1.78)
        .country(russia)
        .build();
  }
}

