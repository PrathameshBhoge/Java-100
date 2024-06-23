package Java_100;

public class nested_if_else {
    public static void main(String[] args) {
        int age = 21;

        if(age < 20 && age >11 ){
            System.out.println("you are in teenAge.");
        } else if (age >= 20 ){
            System.out.println("You are Adult.");
        }else{
            System.out.println("you are child.");
        }
    }
}
