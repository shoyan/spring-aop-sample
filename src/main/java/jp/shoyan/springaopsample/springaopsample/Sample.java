package jp.shoyan.springaopsample.springaopsample;

import java.security.InvalidParameterException;
import org.springframework.stereotype.Component;

@Component
public class Sample {
    public void run(String val) {
        if (val == null) {
            throw new NullPointerException("val is null");
        }

        if (val.isEmpty()) {
            throw new InvalidParameterException("val is empty");
        }
        System.out.println(val);
    }
}
