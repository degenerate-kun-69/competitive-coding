import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder input1 = new StringBuilder();
        input1.append(S);
        input1.reverse();
        String s2 =input1.toString();

        if (s2.equals(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
