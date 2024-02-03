public class GcdOfStrings {
    /*
    Problem Statement:

    For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
        Example 1:
        Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"

        Example 2:
        Input: str1 = "ABABAB", str2 = "ABAB"
        Output: "AB"

        Example 3:
        Input: str1 = "LEET", str2 = "CODE"
        Output: ""

    Constraints:

        1 <= str1.length, str2.length <= 1000
        str1 and str2 consist of English uppercase letters.
    */
    public static void main(String[] args) {
        String string1= "ABCABCABC";
        String string2="ABCABC";
        String x=gcdOfStrings(string1,string2);
        System.out.println(x);

    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {//returns empty string if concat combination does not match
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());//sends length of both strings to find substr size
        return str1.substring(0, gcdLength);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);//recursive function to keep dividing till we arrive at the greatest possible common divisor for both substrings
        }
    }
}
