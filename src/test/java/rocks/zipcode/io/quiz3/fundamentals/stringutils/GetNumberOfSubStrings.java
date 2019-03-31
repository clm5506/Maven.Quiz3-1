package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 10/12/2018.
 */
public class GetNumberOfSubStrings {
    @Test
    public void test1() {
        // given
        String input = "Hello";
        Integer expected = 14;

        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "The Quick Brown";
        Integer expected = 119;
        System.out.println();
        Arrays.stream(StringUtils.getAllSubStrings(input)).forEach(string -> System.out.println(string));
        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
       Assert.assertEquals(expected, actual);


    }
}
