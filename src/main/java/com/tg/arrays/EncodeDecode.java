package com.tg.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
 * <p>
 * Please implement encode and decode
 */
public class EncodeDecode {

    public String encode(List<String> listOfStrings) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : listOfStrings) {
            int length = str.length();
            encodedString.append(length);
            encodedString.append("#");
            encodedString.append(str);
        }
        return encodedString.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String length = "";
            while (str.charAt(i) != '#') {
                length += str.charAt(i);
                i++;
            }
            int wordLength = Integer.parseInt(length);
            i++;

            String word = "";
            for (int j = i; j < wordLength + i; j++) {
                word += str.charAt(j);
            }
            decodedStrings.add(word);
            i = i + wordLength - 1;
        }
        return decodedStrings;
    }
}
