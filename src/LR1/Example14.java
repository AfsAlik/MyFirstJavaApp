package LR1;

import java.util.Scanner;

public class Example14 {

    static int square(int a){
        return a*a;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        System.out.printf("Число - 1: %d\nВведённое число: %d\nЧисло + 1: %d\nЧисло в квадрате: %d", num-1, num, num+1, square(num-1+num+num+1));

    }
}
