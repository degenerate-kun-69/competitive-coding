import java.util.HashSet;
import java.util.Set;
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
            StringBuilder reversed = new StringBuilder();//create string builder object to add elements faster than concat
            int j = 0;
            char[] arr = new char[s.length()];//initialize a character array of length same as string to act as stack
            Set<Character> vowels = new HashSet<>();//create a character hashset for faster comparison than if
            vowels.add('a');//add vowels to hashset
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');

            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) {//if current character is in the hashset vowels, add it to stack
                    arr[j] = s.charAt(i);
                    j++;
                }
            }

            for (int k = 0; k < s.length(); k++) {
                if (vowels.contains(s.charAt(k))) {//if current character is vowel, add vowel from stack
                    reversed.append(arr[j - 1]);
                    j--;
                } else {
                    reversed.append(s.charAt(k));//if not vowel, add character from original string
                }
            }
            return reversed.toString();//return stringbuilder as string

    }
}
