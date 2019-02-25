package by.bntu.fitr.povt.enotes.lab11.util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        return scanner.nextInt();
    }

    public static double inputDouble() {
        return scanner.nextDouble();
    }
}
