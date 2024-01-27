public class ReverseWords {
//    Problem statement:
//    Given an input string s, reverse the order of the words.
//
//    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//    Return a string of the words in reverse order concatenated by a single space.
//
//    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
//
//
//    Example 1:
//
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
//    Example 2:
//
//    Input: s = "  hello world  "
//    Output: "world hello"
//    Explanation: Your reversed string should not contain leading or trailing spaces.
//    Example 3:
//
//    Input: s = "a good   example"
//    Output: "example good a"
//    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//
//
//            Constraints:
//
//            1 <= s.length <= 104
//    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
//    There is at least one word in s.

    public static void main(String[] args) {

        System.out.println(reverseWords("    hello there i am srrijan       "));
    }
    public static String reverseWords(String s){
        String[] arr= s.split(" ");//split string word by word into an array separated by a space
        int temp= arr.length;//use temp variable to store no. of words
        StringBuilder reversed = new StringBuilder();//use stringbuilder for faster concat operations
        while(temp>0){
            if(temp==1){
                reversed.append(arr[temp-1]);//does not add space for final element
            }
            else{
                reversed.append(arr[temp-1]+" ");//adds singular space after every concat
            }
            temp--;//decrement temp variable to point to prev loc in array
        }
       String reverse = reversed.toString().replaceAll("\\s+", " ");//replace all spaces found with one space
        reverse=reverse.trim();//trim string for leading and trailing spaces
        return reverse;//return reversed word string with trimmed spaces
    }
}
