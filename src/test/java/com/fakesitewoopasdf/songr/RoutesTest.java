package com.fakesitewoopasdf.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoutesTest {

    @Test
    public void test_reverse_word() {
        Helpers helper = new Helpers();
        assertTrue("Reverses string", helper.reverseString("forwards").equals("sdrawrof"));
    }
}