package Experiment_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer only.");
        }

        System.out.println("Program continues after handling exception.");
        sc.close();
    }
}

