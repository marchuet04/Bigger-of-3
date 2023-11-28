package javaapplication3g;

import java.util.Scanner;

public class JavaApplication3g {

    public static void main(String[] args) {
        int big;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();

        if (variable_1 >= variable_2 && variable_1 >= variable_3) { //cambie > a >= y == por >=
            big = variable_1;
            System.out.println("The biggest number is: " + big);
        }

        if (variable_2 >= variable_1 && variable_2 >= variable_3) { //cambie == a >= y > por >=
            big = variable_2;
            System.out.println("The biggest number is: " + big);
        }

        if (variable_3 >= variable_2 && variable_3 >= variable_1) { //cambie > a >= y == por >=
            big = variable_3;
            System.out.println("The biggest number is: " + big);
        }
    }
}
