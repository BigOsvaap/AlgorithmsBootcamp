package linkedlist;

/*
* Tienes dos números representados por dos linked lists donde el valor de cada nodo
* representa un dígito. Los dígitos están guardados de manera inversa, de manera que
* las unidades está en el primer nodo (head), las decenas en el segundo nodo, etc.
*
* Escribe un programa que dado dos linked lists, sume los dos números que
* representan y regrese esa suma representada también en un linked list.
*
* */

public class SumTwoNumbers {

    public static LinkedList<Integer> sumNums (LinkedList<Integer> num1, LinkedList<Integer> num2){
        var sum = new LinkedList<Integer>();

        var current1 = num1.head;
        var current2 = num2.head;

        var carry = 0;

        while (current1 != null || current2 != null){

            var value1 = current1 != null ? current1.value : 0;
            var value2 = current2 != null ? current2.value : 0;

            var currentSum = value1 + value2 + carry;

            if (currentSum > 9){
                carry = 1;
                currentSum %= 10;
            }else
                carry = 0;

            sum.addElement(currentSum);

            current1 = current1 != null ? current1.next : null;
            current2 = current2 != null ? current2.next : null;

        }

        if (carry == 1)
            sum.addElement(carry);

        return sum;
    }

}
