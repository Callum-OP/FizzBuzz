public class FizzBuzz {

    public static void main(String[] args) {
        // For every number from 1-100, check if that number is divisible by 3 or 4 or both. 
        // If divisible by 3 print Fizz, if by 4 print Buzz, if both print FizzBuzz.
        int num = 1;

        while (num < 101); {
            System.out.println(num);
            if (num % 3 == 0) {
                if (num % 4 == 0) {
                    System.out.println("FizzBuzz"); 
                } else {
                    System.out.println("Fizz");
                }
            }
            elif (num % 4 == 0); {
                System.out.println("Buzz");
            }
            num += 1;
        }
    }
}
