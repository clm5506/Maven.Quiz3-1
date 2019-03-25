package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        ArrayList<Integer> inputToArrayList = new ArrayList<Integer>();
        ArrayList<Integer> squaredValuesArrayList = new ArrayList<Integer>(Arrays.asList(squaredValues));

        for(int i = 0; i < inputToArrayList.size()-1; i++){
            inputToArrayList.add(inputArray[i] * inputArray[i]);
        }

        for(int i = 0; i < inputToArrayList.size()-1; i++){
            if(!squaredValuesArrayList.contains(inputToArrayList.get(i))){
                return false;
            }
        }
        return true;
    }
}
