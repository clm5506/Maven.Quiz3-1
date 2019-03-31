package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        char[] wordCharArray =  word.toCharArray();

        for(int i = 0; i < wordCharArray.length; i ++){
            if(VowelUtils.isVowel(wordCharArray[i])){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] wordCharArray = word.toCharArray();

        for(Integer i = 0; i < wordCharArray.length; i++){
            if(VowelUtils.isVowel(wordCharArray[i])){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        char[] wordCharArray = word.toCharArray();

        return VowelUtils.isVowel(wordCharArray[0]);
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);

        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};

        boolean ans = false;
        for (Character c : vowels) {
            if (character.equals(c)) {
                ans = true;
                return ans;
            }
        }

        return ans;
    }
}
