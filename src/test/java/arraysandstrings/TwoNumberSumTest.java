package arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    TwoNumberSum twoNumberSum;

    @BeforeEach
    void setUp() {
        twoNumberSum = new TwoNumberSum();
    }

    @Test
    void findTwoNumberSum(){

        var array = new Integer[]{2, 7, 1, 5};
        var target = 9;

        var result = Arrays.asList(twoNumberSum.findTwoNumberSum(array, target));

        assertTrue(result.contains(2) & result.contains(7));

    }

}