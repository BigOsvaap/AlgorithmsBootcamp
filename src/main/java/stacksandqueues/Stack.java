package stacksandqueues;

import utils.Node;

public class Stack<T> {

    Node<T> top;

    public void push(T value){
        if (top == null)
            top = new Node<>(value);
        else{
            var temp = new Node<>(value);
            temp.next = top;
            top = temp;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Node<?> pop(){
        if (!isEmpty()){
            var temp = top;
            top = top.next;
            return temp;
        }
        return null;
    }

    public Node<?> peek(){
        return top;
    }

}
