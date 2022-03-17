package by.itAcademy.homeworks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void reverseArrayTest() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = Task22.reverseArray(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(expected, actual);
    }
}