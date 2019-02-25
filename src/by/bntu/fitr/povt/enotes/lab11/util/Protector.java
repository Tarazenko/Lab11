package by.bntu.fitr.povt.enotes.lab11.util;

import by.bntu.fitr.povt.enotes.lab11.view.Printer;

public class Protector {
    public static int inputPositive(String errorMsg) {
        int value = UserInput.inputInt();
        while (value < 0){
            Printer.print(errorMsg);
            value = UserInput.inputInt();
        }
        return  value;
    }
}
