package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasCycleTest {

    @Test
    void hasCycle() {

        var list = new LinkedList<>(6, 8, 0, 4, 7, 2, 5, 3, 10);

        //Get node with value 0
        var node3 = list.getNodeAtIndex(3);
        //Get last node
        var lastNode = list.getNodeAtIndex(list.length - 1);
        //Point last node to the third node
        lastNode.next = node3;

        assertTrue(HasCycle.hasCycle(list));

    }

    @Test
    void hasNoCycle(){

        var list = new LinkedList<>(6, 8, 0, 4, 7, 2);
        assertFalse(HasCycle.hasCycle(list));

    }
}