package activityStarterCode.loopPractice;

import java.util.Scanner;

public class DoNDrills {
    public static void main(String[] args) {
        for (int i=0; i<=9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=10; i>=0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<=256; i*=2){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<=256; i= i*2+1){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<=25; i +=2){
            System.out.print(Math.sqrt(i) + " ");
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();
        while (num >=0) {
            if (num%2 ==0){
                System.out.println("That is even");
            } else {
                System.out.println("That is odd");
            }
            System.out.println("Enter the next integer: ");
            num =scan.nextInt();
        }
    }
}
