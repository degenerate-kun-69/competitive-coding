public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="abcd";//enter string1 here
        String word2="pqrs";//enter string 2 here
        String merged=mergeAlternately(word1,word2);
        System.out.println(merged);
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged= new StringBuilder();
        boolean word1OrWord2=word1.length()>=word2.length();//checks which is longer string
        if(word1OrWord2){//if word1 is longer
            for(int i=0;i<word2.length();i++){//loop runs till the end of shorter string, appends alternatively
                merged.append(word1.charAt(i));
                merged.append(word2.charAt(i));
            }
            merged.append(word1.substring(word2.length()));//append remaining characters from longer string
        }
        else{
            for (int j=0; j<word1.length();j++){//loop runs till the end of shorter string, appends alternatively
             merged.append(word1.charAt(j));
             merged.append(word2.charAt(j));
            }
            merged.append(word2.substring(word1.length()));//append remaining characters from longer string
        }
        return merged.toString();//return the resultant string
    }//avg runtime= 6ms on leetcode, 42.2mb mem usage
}
