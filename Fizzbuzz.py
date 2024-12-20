# For every number from 1-100, check if that number is divisible by 3 or 4 or both. 
# If divisible by 3 print Fizz, if by 4 print Buzz, if both print FizzBuzz.
num = 1

while num != 101:
    print(num)
    if num % 3 == 0:
        if num % 4 == 0:
            print("FizzBuzz")
        else:
            print("Fizz")
    elif (num % 4 == 0): {
        print("Buzz")
    }
    num += 1
