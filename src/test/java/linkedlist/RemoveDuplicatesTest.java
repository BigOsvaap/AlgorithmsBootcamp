package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void remove() {
        var list1 = new LinkedList<>(4, 5, 9, 0, 5, 1, 2);
        var list2 = new LinkedList<>(1, 2, 3, 3, 2, 1);
        var list3 = new LinkedList<>(1, 1, 1, 1, 1);
        var list4 = new LinkedList<>(1, 2, 2, 3, 3, 5, 5, 10);

        RemoveDuplicates.remove(list1);
        RemoveDuplicates.remove(list2);
        RemoveDuplicates.remove(list3);
        RemoveDuplicates.remove(list4);

        assertTrue(Utils.listHaveSameValues(
                list1,
                new LinkedList<>(4, 5, 9, 0, 1, 2)
        ));
        assertTrue(Utils.listHaveSameValues(
                list2,
                new LinkedList<>(1, 2, 3)
        ));
        assertTrue(Utils.listHaveSameValues(
                list3,
                new LinkedList<>(1)
        ));
        assertTrue(Utils.listHaveSameValues(
                list4,
                new LinkedList<>(1, 2, 3, 5, 10)
        ));

    }
}