package LR1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your year of birth: ");
        int u_year = in.nextInt();

        LocalDate current_date = LocalDate.now();
        int c_year = current_date.getYear();

        System.out.printf("Your name is %s, and your age is %d", name, c_year-u_year);

    }
}
