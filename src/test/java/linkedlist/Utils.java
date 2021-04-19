package linkedlist;

public class Utils {

    public static boolean listHaveSameValues(LinkedList<Integer> list1, LinkedList<Integer> list2){
        return listToString(list1).equals(listToString(list2));
    }

    public static String listToString(LinkedList list){
        var strBuilder = new StringBuilder();
        if (list.head == null){
            strBuilder.append("null\n");
            return strBuilder.toString();
        }

        var currentNode = list.head;
        while (currentNode.next != null){
            strBuilder.append(currentNode.value).append("-> ");
            currentNode = currentNode.next;
        }
        strBuilder.append(currentNode.value).append("-> ");
        strBuilder.append("null\n");
        return strBuilder.toString();
    }

}
