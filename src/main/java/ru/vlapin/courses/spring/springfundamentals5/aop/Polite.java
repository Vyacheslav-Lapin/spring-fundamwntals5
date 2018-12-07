package ru.vlapin.courses.spring.springfundamentals5.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @see Politeness#sayPoliteWordsAndSell(ProceedingJoinPoint)
 */
@Retention(RUNTIME)
public @interface Polite {
}
