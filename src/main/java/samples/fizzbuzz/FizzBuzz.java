package samples.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
