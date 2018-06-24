package by.interactiveAcademy.model;

public class HanoiTower {

    public static void doChange(int n, char A, char B, char C){

        if (n == 1){
            System.out.println("part " + n + " " + A +" --> " + "" + B);
        }
        else{
            doChange(n - 1, A, C, B);
            System.out.println("part " + n + " " + A + " --> " + "" + B);
            doChange(n - 1, C, B, A);
        }
    }
}

