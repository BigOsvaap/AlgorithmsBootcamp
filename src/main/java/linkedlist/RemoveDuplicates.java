package linkedlist;

import java.util.HashSet;

/*
* Escribe un programa borre elementos duplicados de un Linked List.
 * */
public class RemoveDuplicates {

    //Space complexity O(n), Space complexity O(n)
    public static void remove(LinkedList<Integer> list){
        var seen = new HashSet<Integer>();

        if (list.head == null)
            return;

        var prev = list.head;
        var current  = list.head;

        while (current.next != null){
            if (seen.contains(current.value))
                prev.next = current.next;
            else{
                seen.add(current.value);
                prev = current;
            }
            current = current.next;
        }

        if (seen.contains(current.value))
            prev.next = null;

    }

}
