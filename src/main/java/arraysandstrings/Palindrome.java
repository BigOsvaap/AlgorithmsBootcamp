package arraysandstrings;

import java.text.Normalizer;

/**
 *  Escribe   un   programa   que   verifique   que   una   frase   es   un   palíndromo.
 *  Un palíndromo es una frase que se lee igual de derecha a izquierda que de izquierda a derecha.
 *
 */

public class Palindrome {

    public boolean isValidText(String text){
        return text != null;
    }

    //Read more about normalize Strings in https://unicodebook.readthedocs.io/unicode.html#normalization
    public String normalizeText(String text){
        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD);
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < normalizedText.length(); i++){
            char currentChar = normalizedText.charAt(i);
            if (Character.isLetter(currentChar) || Character.isDigit(currentChar))
                strBuilder.append(Character.toLowerCase(currentChar));
        }
        return strBuilder.toString();
    }


    //Time complexity O(n) Space complexity O(1)
    public boolean isPalindrome(String text){
        if (!isValidText(text))
            return false;

        String normalizedText = normalizeText(text);

        int leftIndex = 0;
        int rightIndex = normalizedText.length() - 1;

        while (leftIndex < rightIndex){
            if (normalizedText.charAt(leftIndex) != normalizedText.charAt(rightIndex))
                return false;

            leftIndex++;
            rightIndex--;
        }

        return true;

    }

}
