import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main (String[] args) {

        Random rand = new Random(); 
        int upperbound = 1000;
        int life = 10;
        int int_random = rand.nextInt(upperbound);

        System.out.println("Random integer value from 0 to " + (upperbound) + " : " + int_random);

        while (life != 0) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Input Guess : ");
            
            int guess = scanner1.nextInt();

            if (guess == int_random) {
                System.out.println("");
                System.out.println("win");
                break;
            }
            else if (guess != int_random) {
                life--;
                System.out.println("You only have " + life + " left." + "\n");
                if (guess > int_random) {
                    System.out.println("Your guess is higher.");
                }
                else if (guess < int_random) {
                    System.out.println("Your guess is lower");
                }
            }
            if (life == 0) {
                System.out.println("------------------\nYou lost.");
                break;
            }
        }
    }
}