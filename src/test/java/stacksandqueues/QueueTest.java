package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void pop() {
        var queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop().value);
        assertEquals(1, queue.size);
    }

    @Test
    void push() {
        var queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        assertEquals(2, queue.size);
    }

    @Test
    void peek() {
        var queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek().value);
        assertEquals(2, queue.size);
    }

    @Test
    void isEmpty() {
        var queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    void isNotEmpty(){
        var queue = new Queue<>();
        queue.push(2);
        assertFalse(queue.isEmpty());
    }

}