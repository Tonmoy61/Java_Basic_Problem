/* Write a program to sum of user input until users input ‘q’ from keyboard */

package Java_Basic;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        String choice = "";

        int sum = 0;
        int product = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(!choice.equals("q"))
            System.out.println("Type q to quit");
        choice = input.next();

        if(!choice.equals("q")){
            int number = Integer.parseInt(choice);
            sum = sum+number;
            product = product*number;
            count++;
        }


        System.out.println("Product is: "+product+"\nAverage is: "+((float)sum/count));
    }
}
