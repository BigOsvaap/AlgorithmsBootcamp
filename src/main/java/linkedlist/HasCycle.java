package linkedlist;

/*
*
* Dado un singly linked list, escribe un programa que detecte si un linked list tiene una
* referencia circular
*
* */

public class HasCycle {

    public static boolean hasCycle(LinkedList<?> list){

        var tortoise = list.head;
        var hare = list.head;

        while (tortoise != null){

            hare = hare.next;

            tortoise = tortoise.next;
            if (tortoise != null)
                tortoise = tortoise.next;

            if (hare == tortoise)
                return true;

        }
        return false;
    }

}
