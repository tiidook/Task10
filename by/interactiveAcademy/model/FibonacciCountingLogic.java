package by.interactiveAcademy.model;

public class FibonacciCountingLogic {

    public static int findFibonacciNumber(int number){

        if (number <= 0){
            return -1;
        }

        if (number == 1 || number == 2){
            return 1;
        }
        return findFibonacciNumber(number - 1) + findFibonacciNumber(number - 2);
    }
}
