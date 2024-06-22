package Java_100;

public class Largest_number_in_array {
    public static void main(String[] args) {
        int [] arr = {9,5,10,79,90,5,60,3};

        int high = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]>high){
                high = arr[i];
            }
        }
        System.out.println(high);

    }
}
