// For every number from 1-100, check if that number is divisible by 3 or 4 or both. 
// If divisible by 3 print Fizz, if by 4 print Buzz, if both print FizzBuzz.
int num = 1;

while (num <= 100)
{
    Console.WriteLine(num);
    if (num % 3 == 0)
    {
        if (num % 4 == 0)
        {
            Console.WriteLine("FizzBuzz");
        }
        else
        {
            Console.WriteLine("Fizz");
        }
    }
    else if (num % 4 == 0)
    {
        Console.WriteLine("Buzz");
    }

    num += 1;
}