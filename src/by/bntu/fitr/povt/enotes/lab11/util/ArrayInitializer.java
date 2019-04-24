package by.bntu.fitr.povt.enotes.lab11.util;

import by.bntu.fitr.povt.enotes.lab11.model.data.Array;
import by.bntu.fitr.povt.enotes.lab11.model.exception.InvalidValueException;

import java.util.Random;

public class ArrayInitializer {
    public static void randomInitArray(Array array, int min, int max) throws InvalidValueException {
        Random random = new Random();
        for (int i = 0; i < array.getSize(); i++)
            array.setElement(i,random.nextInt(max - min + 1) + min);
    }

    public static void initArray(Array array) throws InvalidValueException {
        for (int i = 0; i<array.getSize(); i++){
           array.setElement(i,UserInput.inputDouble());
        }
    }
}
