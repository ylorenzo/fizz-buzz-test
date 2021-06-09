package samples.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testNumbers() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }
}
