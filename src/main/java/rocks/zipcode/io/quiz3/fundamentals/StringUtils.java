package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] charArray = str.toCharArray();
        String ans = "";

        for(int i = 0; i <charArray.length; i++ ){
            if(i == indexToCapitalize){
                ans += Character.toUpperCase(charArray[i]);
            } else{
                ans += charArray[i];
            }
        }

        return ans;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        baseString = baseString;

        char[] charArray = baseString.toCharArray();

        return charArray[indexOfString] == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        String ans = "";
        int length = string.length();

        for(int c = 0; c < length; c++){
            for(int i = 1; i <= length-c; i++   ){
                ans += string.substring(c, c+i) + " ";
            }
        }

        String[] newAnswer = ans.split(" ");

        String[] finalAnswer = removeDuplicates(newAnswer);

        return finalAnswer;
    }

    public static String[] removeDuplicates(String[] strArr ){

        List<String> removedDupes = Arrays.stream(strArr).distinct().collect(Collectors.toList());
        return removedDupes.toArray(new String[0]);

    }

    public static Integer getNumberOfSubStrings(String input){
        String[] substrings = getAllSubStrings(input);

        return substrings.length;
    }
}
