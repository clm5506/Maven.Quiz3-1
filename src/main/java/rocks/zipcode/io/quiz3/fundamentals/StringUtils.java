package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

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
        baseString = baseString.toLowerCase();
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
        String ans = strArr[0];
        String previousValue = strArr[0];
        for(int i = 1; i < strArr.length; i++) {
            if(previousValue.equals(strArr[i])) {
                previousValue = strArr[i];
            }else {
                previousValue = strArr[i];
                ans = ans + " " + strArr[i];
            }
        }
        String[] arrayAns = ans.split(" ");


        return arrayAns;

    }

    public static Integer getNumberOfSubStrings(String input){
        String[] substrings = getAllSubStrings(input);

        return substrings.length-1;
    }
}
