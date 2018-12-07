package ru.vlapin.courses.spring.springfundamentals5.aop;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @see Politeness#sayGoodBye()
 */
@Retention(RUNTIME)
public @interface GoodByeble {
}
