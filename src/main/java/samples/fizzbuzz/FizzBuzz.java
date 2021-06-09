package samples.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0){
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
