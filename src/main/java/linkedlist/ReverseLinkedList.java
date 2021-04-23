package linkedlist;

public class ReverseLinkedList {

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
