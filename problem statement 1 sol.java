import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long factorial=1;
        for(int i = 1; i <= N; ++i) {factorial*=i;}
        System.out.printf("%d",factorial);
    }
}