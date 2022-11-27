package LR1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int u_year = in.nextInt();

        LocalDate current_date = LocalDate.now();
        int c_year = current_date.getYear();
        System.out.printf("Current year: %s, User year of birth: %s,\nUser age is: %s", c_year, u_year, c_year-u_year);
    }
}
