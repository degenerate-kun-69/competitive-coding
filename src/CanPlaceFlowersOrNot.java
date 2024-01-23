/*
* PROBLEM STATEMENT:
* You have a long flowerbed in which some of the plots are planted, and some are not. However,
*  flowers cannot be planted in adjacent plots.

*Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
* and an integer n, return true if n new flowers can be planted in the flowerbed without violating the
*  no-adjacent-flowers rule and false otherwise.

*Example 1:

*Input: flowerbed = [1,0,0,0,1], n = 1
*Output: true

*Example 2:

*Input: flowerbed = [1,0,0,0,1], n = 2
*Output: false


*Constraints:

*1 <= flowerbed.length <= 2 * 104
*flowerbed[i] is 0 or 1.
*There are no two adjacent flowers in flowerbed.
*0 <= n <= flowerbed.length
*/
public class CanPlaceFlowersOrNot {
    public static void main(String[] args) {
        int[]arr= new int[5];
        arr[0]=1;
        arr[1]=0;
        arr[2]=0;
        arr[3]=0;
        arr[4]=1;
        System.out.println(canPlaceFlowers(arr,4));


    }


    public static boolean canPlaceFlowers(int[] arr, int x) {
        int n=arr.length;
        int count=0;
        if(n==0){
            return false;
        }
        else if(n==1){
            if(arr[0]==0&&x<=1){
                return true;
            }
            else if(arr[0]==1&&x==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i==0){
                    if(arr[i]==0&&arr[i+1]==0){
                        arr[i]=1;
                        count++;
                    }
                }
                else if(i>0&&i<n-1){
                    if(arr[i]==0&&arr[i-1]==0&&arr[i+1]==0){
                        arr[i]=1;
                        count++;
                    }
                }
                else{
                    if(arr[i]==0&&arr[i-1]==0){
                        arr[i]=1;
                        count++;
                    }
                }

            }
        }

        if(count>=x)
            return true;

        return false;

    }

}
