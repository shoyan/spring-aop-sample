package jp.shoyan.springaopsample.springaopsample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private Sample sample;

    @Test(expected = NullPointerException.class)
    public void run_with_null() {
        sample.run(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void run_with_empty() {
        sample.run("");
    }

    @Test
    public void run_with_ok() {
        sample.run("ok");
    }
}