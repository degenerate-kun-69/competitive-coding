//PROBLEM STATEMENT

import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
//
//
//Constraints:
//
//        2 <= nums.length <= 105
//        -30 <= nums[i] <= 30
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
public class ProductExceptSelfArray {
    public static void main(String[] args) {
        int[]arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
        public static int[] productExceptSelf(int[] nums){
            int [] product=new int[nums.length];
            int[] right = new int[nums.length];
            int[] left = new int[nums.length];
            //1st element of left array is 1 so, it doesn't multiply by 0
            left[0]=1;
            //last elem of right is 1 so, it doesn't multiply by 0
            right[nums.length-1]=1;
            //loop 1 to compute product of elements left to num[i]
            for (int i = 1; i < nums.length; i++){
                left[i] = nums[i - 1] * left[i - 1];}
            //loop 2 to compute product of elements to right of num[i]
            for (int j = nums.length - 2; j >= 0; j--){
                right[j] = nums[j + 1] * right[j + 1];}
            //loop 3 to compute product array
            for (int i = 0; i < nums.length; i++){
                product[i] = left[i] * right[i];}
            return product;
        }

}
