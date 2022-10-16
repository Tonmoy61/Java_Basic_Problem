/* Write a program to print prime numbers from 2 to n */
package Java_Basic;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime_Numbers {
    public static void main(String[] args)
    {

        Scanner scan= new Scanner(System.in);
        System. out.println("Enter a number : ");
        int number = scan.nextInt();
        scan.close();

        List<Integer> primes = IntStream.rangeClosed(2, number)
                .filter(Prime_Numbers::isPrime)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(primes);
    }

    static boolean isPrime(int number) {
        if(number <= 2)
            return number == 2;
        else
            return  (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                            .filter(n -> n % 2 != 0)
                            .noneMatch(n -> (number % n == 0));
    }
}
