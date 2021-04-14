package arraysandstrings;

import java.util.HashSet;

/**
 * Dado un arreglo de números y un valor deseado, regresa los índices de los dos números en el arreglo que sumen ese valor.
 * Puedes asumir que siempre hay una sola solución. No puedes usar el mismo elemento dos veces.
 *
 */

public class TwoNumberSum {

    // Time complexity O(n) Space complexity O(n)
    public Integer[] findTwoNumberSum(Integer[] array, Integer target){

        var seen = new HashSet<Integer>();

        for (int num: array) {
            Integer complement = target - num;
            if (seen.contains(complement))
                return new Integer[] {complement, num};
            seen.add(num);
        }

        return new Integer[0];

    }

}
