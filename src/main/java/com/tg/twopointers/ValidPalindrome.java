package com.tg.twopointers;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public boolean isValidPalindrome(String phrase) {
        phrase = phrase.toLowerCase();
        int i = 0;
        int j = phrase.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(phrase.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(phrase.charAt(j))) {
                j--;
            }
            if (phrase.charAt(i) != phrase.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
