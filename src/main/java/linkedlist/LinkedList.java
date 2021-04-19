package linkedlist;

public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList(){
        size = 0;
    }

    public LinkedList(T ... values){
        size = 0;
        for (T value: values) {
            addElement(value);
        }
    }

    public void addElement(T value){
        size++;
        if (head == null) {
            head = new Node<>(value);
            return;
        }

        var currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = new Node<>(value);
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

class Node<T> {

    T value;
    Node<T> next;

    public Node(T value){
        this.value = value;
    }

}
