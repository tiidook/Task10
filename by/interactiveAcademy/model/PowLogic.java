package by.interactiveAcademy.model;

public class PowLogic {

    public static double getPow(double x, int n){

        if(n != 1){
            return x * getPow(x, n - 1);
        }
        else {
            return x;
        }
    }
}
