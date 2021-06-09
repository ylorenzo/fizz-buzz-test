package samples.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testNumbers() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.convert(1));
    }
}
