package linkedlist;

/*
*
* Implementa un algoritmo que encuentre nodo k lugares antes del último nodo.
*
 */

public class GetNodeKBeforeEnd {

    //Time complexity O(n), Space Complexity O(1)
    public static Node<?> getNodeKBeforeEnd(LinkedList<?> linkedList, int k){

        var kCounter = 0;
        var current = linkedList.head;

        var kNode = linkedList.head;

        while (current.next != null){
            if (kCounter < k)
                kCounter++;
            else
                kNode = kNode.next;

            current = current.next;
        }

        if (kCounter < k)
            return null;

        return kNode;
    }

}
