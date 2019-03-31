package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType ans = null;

        for(int i = 0; i < array.length; i++){
            if(getNumberOfOccurrences(array[i]) % 2 != 0){
                return array[i];
            }

        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(int i = 0; i < array.length; i++){
            if(getNumberOfOccurrences(array[i]) % 2 == 0){
                return array[i];
            }
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        Integer counter = 0;
       for(int i = 0; i < array.length; i ++){
           if(array[i].equals(valueToEvaluate)){
               counter++;
           }
       }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        SomeType[] thisArray = Stream.of(array).filter(x -> predicate.apply(x)).toArray(size->Arrays.copyOf(array, size));

        return thisArray;
    }
}
