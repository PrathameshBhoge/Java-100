package Leetcode.Evaluate_Reverse_Polish_Notation;


// Medium Leetcode - 150

import java.util.Stack;

public class Naive_approach {
    public static void main(String[] args) {
        String [] nums = { "2", "1", "+", "3", "*"};
        System.out.println(calcualte(nums));
    }
    public static  int calcualte(String [] nums){
        int result =0 ;
        String operator = "+-*/";

        Stack<String> stack= new Stack<String>();

        for(String t : nums){
            if(!operator.contains(t)){
                stack.push(t);
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;

                }
            }
        }
        result = Integer.valueOf(stack.pop());
        return result;
    }
}
