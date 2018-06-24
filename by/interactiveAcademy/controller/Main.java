package by.interactiveAcademy.controller;

import by.interactiveAcademy.model.*;
import by.interactiveAcademy.view.Printer;
import com.company.model.*;

public class Main {

    public static void main(String[] args) {

        Printer.print(CountingNumbersLogic.countNumbers(8125));
        Printer.print(PowLogic.getPow(-5,2));
        Printer.print(EqualsLogic.getEquals(1562,14));
        Printer.print(FibonacciCountingLogic.findFibonacciNumber(6));

        HanoiTower.doChange(3,'A','B','C');

    }


}
