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

public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    boolean placeable = true;
    int i = 0;

        while (i < flowerbed.length) {//traverses array from end to start
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                placeable = true;
                n--;
                i += 2; // Skip the next position as it's occupied by the newly planted flower
            }

            i++;
        }

        return n <= 0 && placeable;
    }

}
