package stacksandqueues;

import utils.Node;

public class Queue<T> {

    Node<T> first;
    Node<T> last;

    int size;

    public Queue(){
        size = 0;
    }

    public Node<T> pop(){
        if (!isEmpty()){
            var temp = first;
            first = first.next;
            size--;
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
        size++;
    }

    public Node<T> peek(){
        return first;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
