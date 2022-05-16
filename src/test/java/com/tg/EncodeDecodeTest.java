package com.tg;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncodeDecodeTest {

    EncodeDecode encodeDecode = new EncodeDecode();

    @Test
    public void encode() {
        List<String> listOfStrings = Arrays.asList("list", "of", "strings", "and", "1", "and", "#");
        String encodedString = encodeDecode.encode(listOfStrings);
        assertEquals("4#list2#of7#strings3#and1#13#and1##", encodedString);
    }

    @Test
    public void decode() {
        List<String> listOfStrings = encodeDecode.decode("4#list2#of7#strings3#and1#13#and1##");
        assertEquals(Arrays.asList("list", "of", "strings", "and", "1", "and", "#"), listOfStrings);

    }
}