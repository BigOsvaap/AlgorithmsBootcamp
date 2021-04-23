package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverse() {

        var list1 = new LinkedList<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var result = ReverseLinkedList.reverse(list1);

        var list2 = new LinkedList<Integer>();
        var result2 = ReverseLinkedList.reverse(list2);

        var list3 = new LinkedList<Integer>(1, 2);
        var result3 = ReverseLinkedList.reverse(list3);

        assertTrue(Utils.listHaveSameValues(result,
                new LinkedList<>(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)));

        assertTrue(Utils.listHaveSameValues(result2,
                new LinkedList<Integer>()));

        assertTrue(Utils.listHaveSameValues(result3,
                new LinkedList<>(2, 1)));

    }
}