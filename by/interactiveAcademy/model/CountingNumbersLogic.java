package by.interactiveAcademy.model;

public class CountingNumbersLogic {

    public static int countNumbers(int number){

       if (number / 10 != 0){
           return 1 + countNumbers(number / 10);
       }else {
           return 1;
       }
    }
}
