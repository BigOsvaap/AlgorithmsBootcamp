package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addElement() {
        var list = new LinkedList<Integer>();
        list.print();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.print();
    }

    @Test
    void print() {
        var list = new LinkedList<>(1, 2, 3, 4, 5);
        list.print();
        var nullList = new LinkedList<>();
        nullList.print();
    }

}