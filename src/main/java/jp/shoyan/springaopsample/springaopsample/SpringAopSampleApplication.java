package jp.shoyan.springaopsample.springaopsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopSampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringAopSampleApplication.class, args);
        Sample sample = ctx.getBean(Sample.class);
        sample.run("ok");
    }
}
