package com.joshuadavy.dailycoding.test;

import com.joshuadavy.dailycoding.WordCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

     WordCounter counter;

    @BeforeEach
    void setUp() {
        counter = new WordCounter();
    }

    @Test
    void WordCounterNullTest() {
        WordCounter.stringCounter(null);
    }

    @Test
    void WordCounterBadInputTest() {
        String badText = "???///???";
        WordCounter.stringCounter(badText);
        int result = WordCounter.stringCounter(badText);
        assert(result == 0);
    }

    @Test
    void WordCounterSpaceTest() {
        String badText = " ";
        WordCounter.stringCounter(badText);
        int result = WordCounter.stringCounter(badText);
        assert(result == 0);
    }

    @Test
    void WordCounterPeriodTest() {
        String badText = "This should return.";
        WordCounter.stringCounter(badText);
        int result = WordCounter.stringCounter(badText);
        assert (result == 3);
    }
    @Test
    void WordCounterNumericTest() {
        String badText = "one 1";
        WordCounter.stringCounter(badText);
        int result = WordCounter.stringCounter(badText);
        assert (result == 1);
    }
}
