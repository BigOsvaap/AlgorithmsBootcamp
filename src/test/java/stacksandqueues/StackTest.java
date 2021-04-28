package stacksandqueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {


    @Test
    void push() {
        var stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size);
    }

    @Test
    void isEmpty() {
        var stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    void isNotEmpty(){
        var stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    void pop() {
        var stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop().value);
        assertEquals(1, stack.size);
    }

    @Test
    void peek() {
        var stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop().value);
    }
}