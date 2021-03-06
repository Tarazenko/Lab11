package by.bntu.fitr.povt.enotes.lab11.controller;

import by.bntu.fitr.povt.enotes.lab11.model.data.Array;
import by.bntu.fitr.povt.enotes.lab11.model.exception.ArrayDimensionException;
import by.bntu.fitr.povt.enotes.lab11.model.exception.InvalidValueException;
import by.bntu.fitr.povt.enotes.lab11.model.logic.ArrayWorker;
import by.bntu.fitr.povt.enotes.lab11.util.ArrayInitializer;
import by.bntu.fitr.povt.enotes.lab11.util.Protector;
import by.bntu.fitr.povt.enotes.lab11.view.Printer;

public class Lab11 {
    public static void main(String[] args) throws ArrayDimensionException, InvalidValueException {
        Printer.print("Input array size: ");
        int size = Protector.inputPositive("Input right size: ");
        Array array = new Array(new double[size]);
        Printer.print("Input array items:");
        ArrayInitializer.initArray(array);
        Printer.print("Max abs value: " + ArrayWorker.findAbsMax(array));
        Printer.print("Sum between two first positive: " + ArrayWorker.calculateSumBetweenFirstPositive(array));
        Printer.print("Amount of positive items: " + ArrayWorker.countPositiveItems(array));
        Printer.print("Sum after last zero: " + ArrayWorker.calculateSumAfterLastZero(array));
    }
}
