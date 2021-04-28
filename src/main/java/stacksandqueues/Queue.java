package stacksandqueues;

import utils.Node;

public class Queue<T> {

    Node<T> first;
    Node<T> last;

    public Node<T> pop(T value){
        if (!isEmpty()){
            var temp = first;
            first = first.next;
            return temp;
        }
        return null;
    }

    public void push(T value){
        if (first == null){
            first = new Node<>(value);
            last = first;
        }else{
            last.next = new Node<>(value);
            last = last.next;
        }
    }

    public Node<T> peek(){
        return first;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
