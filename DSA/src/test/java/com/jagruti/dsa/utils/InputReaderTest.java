package com.jagruti.dsa.utils;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {
    @Test
    void testInputReaderExample() {
        // TODO: Replace with real test when InputReader implementation is available
        assertTrue(true);
    }

    @Test
    void testNext() throws IOException {
        String input = "hello world\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputReader reader = new InputReader();
        assertEquals("hello", reader.next());
        assertEquals("world", reader.next());
    }

    @Test
    void testNextInt() throws IOException {
        String input = "42 100\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputReader reader = new InputReader();
        assertEquals(42, reader.nextInt());
        assertEquals(100, reader.nextInt());
    }

    @Test
    void testNextLong() throws IOException {
        String input = "1234567890123 9876543210\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputReader reader = new InputReader();
        assertEquals(1234567890123L, reader.nextLong());
        assertEquals(9876543210L, reader.nextLong());
    }
}

