package Java_100;

public class find_the_count_Even_number_in_Array {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
