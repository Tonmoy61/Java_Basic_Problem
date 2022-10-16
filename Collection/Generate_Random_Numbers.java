/* Write a program to generate 2 random numbers which will not be shown to the user.
 Take a user input and match it with any of the random numbers. If correct give it 1 point
  and if incorrect, do not give it any point. Finally, repeat this for 10 times and count
  the point user achieved. */

package Java_Basic;
import java.util.ArrayList;
import java.util.Random;
public class Generate_Random_Numbers {
    public static void main(String[] args) {
        int size = 30;

        ArrayList<Integer> list = new ArrayList<>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println("Selected: "+list.remove(index));
        }
    }
}
