package linkedlist;

import utils.Node;

public class LinkedList<T> {

    public Node<T> head;
    public Node<T> tail;

    int length;

    public LinkedList(){
        length = 0;
    }

    public LinkedList(T ... values){
        length = 0;
        for (T value: values) {
            addElement(value);
        }
    }

    public void addElement(T value){
        if (head == null) {
            head = new Node<>(value);
            tail = head;
        }else{
            tail.next = new Node<>(value);
            tail = tail.next;
        }
        length++;
    }

    public Node<T> getNodeAtIndex(int index){

        var count = 0;

        var current = head;

        while (count < index & current != null){
            current = current.next;
            count++;
        }

        return current;

    }

    public void print(){
        if (head == null){
            System.out.print("null\n");
            return;
        }

        var currentNode = head;
        while (currentNode.next != null){
            System.out.print(currentNode.value + "-> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.value + "-> ");
        System.out.print("null\n");
    }

}


