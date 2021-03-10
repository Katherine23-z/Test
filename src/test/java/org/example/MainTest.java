package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void arrayOfTwoValuesWrongValues() {
        Main main = new Main();

        int[]array = {4, 2, 5, 1};

        boolean actual = main.arrayOfTwoValues(array);

        boolean expected = false;

        Assertions.assertFalse(expected, String.valueOf(actual));
    }

    @Test
    void arrayOfTwoValuesSimilarvalues() {
        Main main = new Main();

        int[]array = {4, 4, 4, 4};

        boolean actual = main.arrayOfTwoValues(array);

        boolean expected = false;

        Assertions.assertFalse(expected, String.valueOf(actual));
    }

    @Test
    void arrayOfTwoValues() {
        Main main = new Main();

        int[]array = {4, 1, 1, 4, 1};

        boolean actual = main.arrayOfTwoValues(array);

        boolean expected = true;

        Assertions.assertTrue(expected, String.valueOf(actual));
    }

    @Test
    void arrayOfTwoValues1() {
        Main main = new Main();

        int[]array = {4, 4, 1, 1};

        boolean actual = main.arrayOfTwoValues(array);

        boolean expected = true;

        Assertions.assertTrue(expected, String.valueOf(actual));
    }

    @Test
    void newArrayFromLastIndex() {
        Main main = new Main();
        int[] array = {1, 2, 3, 4, 6, 7};

        int[] actual = main.newArrayFromLastIndex(array);

        int[] expected = {6, 7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void newArrayFromLastIndex1() {
        Main main = new Main();
        int[] array = {1, 4, 1, 4, 6, 4};

        int[] actual = main.newArrayFromLastIndex(array);

        int[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void newArrayFromLastIndexException() {
        Main main = new Main();
        int[] array = {1, 2, 0, 2, 6, 7};

       Assertions.assertThrows(RuntimeException.class, () ->main.newArrayFromLastIndex(array));
    }
}