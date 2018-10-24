package jp.shoyan.springaopsample.springaopsample;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {
    @Before("execution(* jp.shoyan.springaopsample.springaopsample.Sample.*(..))")
    public void before() {
        System.out.println("before");
    }

    @AfterThrowing(
            pointcut = "execution(* jp.shoyan.springaopsample.springaopsample.Sample.*(..))",
            throwing = "ex")
    public void afterThrowing(IllegalArgumentException ex) {
        System.out.println("IllegalArgumentException !!");
        System.out.println(ex.getMessage());
    }

    @AfterThrowing(
            pointcut = "execution(* jp.shoyan.springaopsample.springaopsample.Sample.*(..))",
            throwing = "ex")
    public void recoveryException(NullPointerException ex) {
        System.out.println("NullPointerException!!");
        System.out.println(ex.getMessage());
    }
}

