package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        List<String> answer = new ArrayList<>();
        str = str.toLowerCase();

            for(int j = 0; j < str.length(); j++){
                if(Character.isLetter(str.charAt(j))){
                    answer.add(StringUtils.capitalizeNthCharacter(str, j));
                }

            }

        return answer.toArray(new String[answer.size()]);
    }






}
