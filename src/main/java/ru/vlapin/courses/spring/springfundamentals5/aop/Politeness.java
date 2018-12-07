package ru.vlapin.courses.spring.springfundamentals5.aop;

import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.vlapin.courses.spring.springfundamentals5.Person;

import static lombok.AccessLevel.PRIVATE;

@Slf4j
@Aspect
@Component
@FieldDefaults(level = PRIVATE)
public final class Politeness {

  @Before("@annotation(Congrats) && args(person)")
  public final void sayHello(@NotNull Person person) {
    System.out.printf("Hello, %s. How are you doing?\n", person.getName());
  }

  @AfterReturning(
      pointcut = "@annotation(FeedBackNeeded)",
      returning = "squishee")
  public final void askOpinion(@NotNull Squishee squishee) {
    System.out.printf("Is %s good enough?\n", squishee.getName());
  }

  @AfterThrowing("@annotation(BrokeProof)")
  public final void sayYouAreNotAllowed() {
    System.out.println("Hmmmmmm...");
  }

  @After("@annotation(GoodByeble)")
  public final void sayGoodBye() {
    System.out.println("Good bye!");
  }

  @NotNull
  @SneakyThrows
  @Contract(pure = true)
  @Around("@annotation(Polite)")
  public final Object sayPoliteWordsAndSell(@NotNull ProceedingJoinPoint joinPoint) {
    System.out.println("Hi!");
    Object result = joinPoint.proceed();
    System.out.println("See you!");
    return result;
  }


}
