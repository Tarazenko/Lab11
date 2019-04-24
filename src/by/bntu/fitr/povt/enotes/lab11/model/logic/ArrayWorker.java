package by.bntu.fitr.povt.enotes.lab11.model.logic;

import by.bntu.fitr.povt.enotes.lab11.model.data.Array;
import by.bntu.fitr.povt.enotes.lab11.model.exception.ArrayDimensionException;

public class ArrayWorker {
    public static double findAbsMax(Array array) throws ArrayDimensionException {
        double max = 0;
        for (int i = 0; i < array.getSize(); i++) {
            max = Math.max(Math.abs(array.getElement(i)), max);
        }
        return max;
    }

    public static int findFirstPositive(Array array, int startNumber) throws ArrayDimensionException {
        int positiveNumber = -1;
        for (int i = startNumber; i < array.getSize(); i++) {
            if (array.getElement(i) > 0) {
                positiveNumber = i;
                break;
            }
        }
        return positiveNumber;
    }

    public static double calculateSumBetweenFirstPositive(Array array) throws ArrayDimensionException {
        int firstPositive = findFirstPositive(array, 0);
        int secondPositive = findFirstPositive(array, firstPositive + 1);
        double sum = 0;
        if (secondPositive == -1) {
            sum = Double.POSITIVE_INFINITY;
        } else {

            for (int i = firstPositive + 1; i < secondPositive; i++) {
                sum += array.getElement(i);
            }
        }
        return sum;

    }

    public static int countPositiveItems(Array array) throws ArrayDimensionException {
        int amount = 0;
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getElement(i)> 0) {
                amount++;
            }
        }
        return amount;
    }

    public static double calculateSumAfterLastZero(Array array) throws ArrayDimensionException {
        double sum = 0;
        boolean flag = false;
        for (int i = array.getSize() - 1; i >= 0; i--) {
            if (array.getElement(i) == 0) {
                flag = true;
                break;
            }
            sum += array.getElement(i);
        }
        return flag ? sum : Double.POSITIVE_INFINITY;
    }

}
