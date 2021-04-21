package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNodeKBeforeEndTest {

    @Test
    void getNodeKBeforeEnd() {

        var list = new LinkedList<>(2, 3, 1, 4, 9, 10, 11);
        var res1 = GetNodeKBeforeEnd.getNodeKBeforeEnd(list, 2);

        var list2 = new LinkedList<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var res2 = GetNodeKBeforeEnd.getNodeKBeforeEnd(list2, 9);

        var list3 = new LinkedList<>(1, 2, 3, 4);
        var res3 = GetNodeKBeforeEnd.getNodeKBeforeEnd(list3, 4);

        assertTrue(res1.value.equals(9));
        assertTrue(res2.value.equals(1));
        assertTrue(res3 == null);

    }
}