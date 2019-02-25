package by.bntu.fitr.povt.enotes.lab11.model.logic;

public class ArrayWorker {
    public static double findAbsMax(double[] array) {
        double max = 0;
        for (double i : array) {
            max = Math.max(Math.abs(i), max);
        }
        return max;
    }

    public static int findFirstPositive(double[] array, int startNumber) {
        int positiveNumber = -1;
        for (int i = startNumber; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumber = i;
                break;
            }
        }
        return positiveNumber;
    }

    public static double calculateSumBetweenFirstPositive(double[] array) {
        int firstPositive = findFirstPositive(array, 0);
        int secondPositive = findFirstPositive(array, firstPositive + 1);
        double sum = 0;
        if (secondPositive == -1) {
            sum = Double.POSITIVE_INFINITY;
        } else {

            for (int i = firstPositive + 1; i < secondPositive; i++) {
                sum += array[i];
            }
        }
        return sum;

    }

    public static int countPositiveItems(double[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                amount++;
            }
        }
        return amount;
    }

    public static double calculateSumAfterLastZero(double[] array) {
        double sum = 0;
        boolean flag = false;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                flag = true;
                break;
            }
            sum += array[i];
        }
        return flag ? sum : Double.POSITIVE_INFINITY;
    }

}
