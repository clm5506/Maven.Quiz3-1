package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] stringArray = str.split(" ");
        for(int i = 0; i < stringArray.length; i++){
            if(VowelUtils.startsWithVowel(stringArray[i])){
                stringArray[i] = stringArray[i] + "way";
            } else {
                int index = VowelUtils.getIndexOfFirstVowel(stringArray[i]);
                stringArray[i] = stringArray[i].substring(index)+stringArray[i].substring(0,index) + "ay";
            }
        }

        return Arrays.toString(stringArray).replace("[","").replace("]","").replace(",","");


//return null;
    }

}
