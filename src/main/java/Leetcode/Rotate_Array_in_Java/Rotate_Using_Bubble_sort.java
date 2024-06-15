package Leetcode.Rotate_Array_in_Java;

public class Rotate_Using_Bubble_sort {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int  order = 3;
        rotate(nums,order);

    }
    public static  void rotate(int nums[], int order){
        for (int i =0;i< order;i++){
            for(int j = nums.length-1;j>0;j--){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1]= temp;
            }
        }

        for(int i =0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
