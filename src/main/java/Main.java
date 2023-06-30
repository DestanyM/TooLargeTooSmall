/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

import static java.util.Random.*;

public class Main {

    public static void main(String[] args) {

        int guesses = 0;

        Scanner in = new Scanner(System.in);
        int num;
        num = Random.nextInt(10)+1;
        System.out.println(num);
        System.out.println("Try to guess the selected number between 1 and 20: ");
        int input;
        input = Scanner.nextInt();
        guesses++;

        if (input > num) {
            System.out.println("too large");
        }else if (input < num) {
            System.out.println ("too small");
        } else {
            System.out.println("correct guess");
        }
        String result = (input > num) ? "too large" : "too small";
        System.out.println(result);
        System.out.println("It took you " + guesses + " tries to guess correctly.");

    }
}
