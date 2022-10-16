
/* Write a program to calculate GPA and find grade*/

package Java_Basic;
import java.util.Scanner;
public class Calculate_GPA {
    public static void main(String[] args) {
        float[] marks = new float[8];
        float sum = 0, avg;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("ALL subject marks input here: ");
        for (i = 0; i < 8; i++)
            marks[i] = scan.nextFloat();

        for (i = 0; i < 8; i++)
            sum = sum + marks[i];
        avg = sum / 8;

        System.out.print("\nGrade = ");

        if (avg >= 94)
            System.out.println("A");
        else if (avg >= 90)
            System.out.println("A-");
        else if (avg >= 87)
            System.out.println("B+");
        else if (avg >= 83)
            System.out.println("B");
        else if (avg >= 80)
            System.out.println("B-");
        else if (avg >= 77)
            System.out.println("C+");
        else if (avg >= 73)
            System.out.println("C");
        else if (avg >= 70)
            System.out.println("C-");
        else if (avg >= 67)
            System.out.println("D+");
        else if (avg >= 63)
            System.out.println("D");
        else if (avg >= 60)
            System.out.println("D-");
        else
            System.out.println("F");
    }
}
