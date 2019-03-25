package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        List<String> answer = new ArrayList<>();
        str = str.toLowerCase();

            for(int j = 0; j < getLengthNotIncludingSpecial(str); j++){
                answer.add(capitalizeOneLetter(str,j));
            }

        return answer.toArray(new String[answer.size()]);
    }


    public static int getLengthNotIncludingSpecial(String str){
        int counter = 0;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                counter++;
            }
        }
        return counter;
    }

        public static String capitalizeOneLetter (String string,int index){
            String ans = "";
            for (int i = 0; i < string.length(); i++) {
                if (i == index) {
                    ans += string.substring(index, index+1).toUpperCase();
                }
                 else {
                    ans += string.substring(i,i+1);
                }
            }

            return ans;
        }

}
