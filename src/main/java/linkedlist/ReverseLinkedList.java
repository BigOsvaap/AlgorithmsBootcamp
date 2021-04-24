package linkedlist;

/*
*
* Dado un singly linked list, escribe un programa que invierta la dirección de dicha
linked list (reverse)

*
* */

public class ReverseLinkedList {

    //Time complexity O(n), Space complexity O(1)
    public static LinkedList<Integer> reverse(LinkedList<Integer> list){

        Node<Integer> prev  = null;
        var current = list.head;

        while(current != null){
            var temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        list.head = prev;

        return list;

    }

}
