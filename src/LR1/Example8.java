package LR1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the name of the current day of the week: ");
        String name_of_day = in.nextLine();

        System.out.print("Input name of the current month: ");
        String month = in.nextLine();

        System.out.print("Input number of the day in the month: ");
        int day = in.nextInt();

        System.out.printf("Name of current day: %s,  Number of the day: %d,  Name of current month: %s\n", name_of_day, day, month);
        in.close();

    }
}
