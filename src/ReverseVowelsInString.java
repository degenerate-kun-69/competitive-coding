public class ReverseVowelsInString {
//    PROBLEM STATEMENT :
//    Given a string s, reverse only all the vowels in the string and return it.
//
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//    Example 1:
//
//    Input: s = "hello"
//    Output: "holle"
//    Example 2:
//
//    Input: s = "leetcode"
//    Output: "leotcede"
//
//
//    Constraints:
//
//            1 <= s.length <= 3 * 105
//    s consist of printable ASCII characters.
    public static void main(String[] args) {
//create a stack and store only vowels in the stack and push them out
        System.out.println(reverseVowels("hello there this seems to be working pretty well"));
    }
    public static String reverseVowels(String s) {
        String reversed= "";
        int j=0;
        char[] arr= new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                arr[j]=s.charAt(i);//if vowel found, pushes it to stack
                j++;//points to next position in array
            }

        }
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='a' || s.charAt(k)=='e' || s.charAt(k)=='i' || s.charAt(k)=='o' || s.charAt(k)=='u' || s.charAt(k)=='A' || s.charAt(k)=='E' || s.charAt(k)=='I' || s.charAt(k)=='O' || s.charAt(k)=='U'){
                reversed+=arr[j-1];//if vowel, pushes vowel from stack into reversed
                j--;//decrements counter
            }
            else{
                reversed+=s.charAt(k);//if not vowel, add from original string
            }

        }
        return reversed;
    }
}
