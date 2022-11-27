package LR1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int u_age = in.nextInt();

        LocalDate current_date = LocalDate.now();
        int c_year = current_date.getYear();

        System.out.printf("Your year of birth is: %d", c_year-u_age);

    }
}
