/*  Write  a program to find the factorial of a given number */
package Java_Basic;

public class Find_Factorial_Number {
    public static void main(String[] args) {

        int num = 19;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

