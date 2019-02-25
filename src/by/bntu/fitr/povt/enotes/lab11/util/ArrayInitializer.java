package by.bntu.fitr.povt.enotes.lab11.util;

import java.util.Random;

public class ArrayInitializer {
    public static void randomInitArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(max - min + 1) + min;
    }

    public static void initArray(double[] array) {
        for (int i = 0; i<array.length; i++){
           array[i] =  UserInput.inputDouble();
        }
    }
}
