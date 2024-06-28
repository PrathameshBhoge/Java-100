package Java_100;

import java.util.Scanner;

public class Swap_without_using_3rd_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Entered Values : "+"x = "+x+"Y = "+y);
        int temp = x;
        x= y ;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}
