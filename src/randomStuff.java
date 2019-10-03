import java.util.Scanner;
import  java.util.Random;

public class randomStuff {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scan.nextInt();
        int sth = generator.nextInt(num +1);
        System.out.println("The random number between 0 and " + num + " is " + sth);
    }
}
