public class MinMaxGame {
    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0]=93;
        arr[1]=40;
        if(minMaxGame(arr)==40){
            System.out.println(true);
        }
        else {
            System.out.println(false);}
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
