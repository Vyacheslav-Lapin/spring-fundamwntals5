package ru.vlapin.courses.spring.springfundamentals5.aop;

import org.aspectj.lang.JoinPoint;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @see Politeness#sayHello(JoinPoint)
 */
@Retention(RUNTIME)
public @interface Congrats {
}
