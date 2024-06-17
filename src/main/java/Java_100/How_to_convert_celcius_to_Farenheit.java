package Java_100;

import java.util.Scanner;

public class How_to_convert_celcius_to_Farenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temprature in farenheit : ");
        float temperatue = sc.nextFloat();

        float celcius = ((temperatue - 32)*5)/9;

        System.out.println(celcius);


    }
}
