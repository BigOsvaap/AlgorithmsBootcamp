package stacksandqueues;

import utils.Node;

public class Stack<T> {

    Node<T> top;
    int size;

    public Stack(){
        size = 0;
    }

    public void push(T value){
        if (top == null)
            top = new Node<>(value);
        else{
            var temp = new Node<>(value);
            temp.next = top;
            top = temp;
        }
        size++;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Node<?> pop(){
        if (!isEmpty()){
            var temp = top;
            top = top.next;
            size--;
            return temp;
        }
        return null;
    }

    public Node<?> peek(){
        return top;
    }

}
