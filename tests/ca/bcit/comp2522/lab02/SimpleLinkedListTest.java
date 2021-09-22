package ca.bcit.comp2522.lab02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleLinkedListTest {

    private SimpleLinkedList testList;

    @BeforeEach
    void setUp() {
        testList = new SimpleLinkedList();
    }

    @Test
    void addElementToEmptyList() {
        testList.add("A");
        assertEquals(1, testList.size());
        assertEquals(0, testList.find("A"));
        assertEquals(-1, testList.find("B"));
    }

    @Test
    void addMultipleElementsInOrder() {
        for (int i = 0; i < 5; ++i) {
            testList.add(Character.toString((char) (i + 'A')));
        }
        assertEquals(5, testList.size());
        for (int i = 0; i < 5; ++i) {
            assertEquals(i, testList.find(Character.toString((char) (i + 'A'))));
        }
        assertEquals(-1, testList.find("F"));
    }

    @Test
    void removeElementFromListOfOne() {
        testList.add("A");
        assertEquals(-1, testList.remove("B"));
        assertEquals(0, testList.remove("A"));
        assertEquals(0, testList.size());
    }

    @Test
    void sizeOfEmptyLinkedList() {
        assertEquals(0, testList.size());
    }

    @Test
    void findNothingInEmptyList() {
        assertEquals(-1, testList.find("A"));
    }

    @Test
    void removeNothingFromEmptySimpleLinkedList() {
        assertEquals(-1, testList.remove("A"));
    }
}