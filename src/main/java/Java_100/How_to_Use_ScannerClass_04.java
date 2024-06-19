package Java_100;

import java.sql.SQLOutput;
import java.util.Scanner;

public class How_to_Use_ScannerClass_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int i = sc.nextInt();

        System.out.print("You entered : "+ i );

        System.out.print("Enter String : ");
        String s = sc.nextLine();

        System.out.print("You have entred a String :  "+ s );

    }
}
