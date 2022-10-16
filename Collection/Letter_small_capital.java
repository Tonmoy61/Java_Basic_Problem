/*Write a program to check if inputted letter is small or capital*/

package Java_Basic;
import java.util.Scanner;
public class Letter_small_capital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Alphabet : ");
        char ch;
        ch = scanner.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {

            System.out.println(ch + " Is Upper Case alphabet.");

        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " Is Upper Case alphabet.");

        } else {

            System.out.println(ch + " Is not an alphabet.");

        }

    }
}
