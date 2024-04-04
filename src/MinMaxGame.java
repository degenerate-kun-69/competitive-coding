//import java.util.Scanner; //uncomment import statement too if using for loop

public class MinMaxGame {
    public static void main(String[] args) {
        double n= 1;//replace n with anything you want
        int[] arr = new int[(int) Math.pow(2,n)];//in the problem statement it's given array will be 2^n
        arr[1]=40;
        arr[0]=93;//enter elements manually or uncomment the for loop for scanner input
        int ans=40;//replace this with the correct answer for your test case
//        Scanner sc= new Scanner(System.in); // uncomment this statement for scanner
//        for loop to input:
//        for (int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
        //conditional to check if your code passes the test
        System.out.println(minMaxGame(arr) == ans);
    }
    public static int minMaxGame(int[] nums) {
        int[] newNums = new int[nums.length/2];
        if(nums.length==1){
            return nums[0];
        }
        else{
            for(int i=0;i<newNums.length;i++){
                if(i%2==0){
                    newNums[i]= Math.min(nums[2*i],nums[2*i+1]);
                }
                else{
                    newNums[i]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }
        }
        return minMaxGame(newNums);
    }
}