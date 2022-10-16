/* Write a program to check balance and withdraw money
 from ATM booth using if else or switch case*/

package Java_Basic;
import java.util.Scanner;
public class Check_Balance {
    public static void main(String[] args)
    {
        int balance = 0, withdraw, deposit;


        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("ATM Machine\n");
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 for EXIT\n");
            System.out.print("Select the operation:");


            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");


                    withdraw = sc.nextInt();


                    if(balance >= withdraw)
                    {

                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");


                    deposit = sc.nextInt();


                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
