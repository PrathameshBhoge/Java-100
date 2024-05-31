package Leetcode.Rotate_Array_in_Java;


// Time Complexity = O(n)

public class Brute_Force_approch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        rotate(nums);
    }
    public static void rotate(int [] nums){
        int [] arr = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            arr[nums.length-1-i]= nums[i];
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
