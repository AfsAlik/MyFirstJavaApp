package LR1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        System.out.printf("Сумма %d и %d = %d\nРазность %d и %d = %d", num1, num2, num1+num2, num1, num2, num1-num2);

    }
}
