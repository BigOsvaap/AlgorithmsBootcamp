package arraysandstrings;

public class Palindrome {

    //Just take into account white spaces
    public boolean isPalindrome(String sentence){
        int rightIndex = sentence.length() - 1;
        int leftIndex = 0;

        while (leftIndex < rightIndex){

            char leftChar = sentence.charAt(leftIndex);
            char rightChar = sentence.charAt(rightIndex);

            if (Character.isWhitespace(leftChar)){
                leftIndex++;
                leftChar = sentence.charAt(leftIndex);
            }
            if (Character.isWhitespace(rightChar)){
                rightIndex--;
                rightChar = sentence.charAt(rightIndex);
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                return false;

            leftIndex++;
            rightIndex--;

        }
        return true;
    }

}
