package LR1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input name of the current month: ");
        String name_of_month = in.nextLine();

        System.out.print("Input number of the day in the month: ");
        int day = in.nextInt();

        System.out.printf("A month '%s' contains the following number of days: %d \n", name_of_month, day);
        in.close();

    }
}
