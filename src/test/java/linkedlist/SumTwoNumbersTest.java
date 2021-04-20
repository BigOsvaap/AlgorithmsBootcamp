package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoNumbersTest {

    @Test
    void sumNums(){

        assertTrue(Utils.listHaveSameValues(
                SumTwoNumbers.sumNums(new LinkedList<>(2, 3, 1), new LinkedList<>(8)),
                new LinkedList<>(0, 4, 1)));

        assertTrue(Utils.listHaveSameValues(
                SumTwoNumbers.sumNums(new LinkedList<>(9, 9, 9), new LinkedList<>(1)),
                new LinkedList<>(0, 0, 0, 1)));

        assertTrue(Utils.listHaveSameValues(
                SumTwoNumbers.sumNums(new LinkedList<>(8, 9, 9), new LinkedList<>(8)),
                new LinkedList<>(6, 0, 0, 1)));

    }

}