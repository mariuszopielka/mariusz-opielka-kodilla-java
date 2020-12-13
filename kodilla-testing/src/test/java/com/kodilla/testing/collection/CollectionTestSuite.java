package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("TEST BEGIN");
    }
    @AfterEach
    public void after(){
        System.out.println("TEST END !");
    }
    @DisplayName ("when list is empty, " +
            "then check if the Class is correct")
    @Test
    public void testOddNumbersExterminatorEmptyList () {
        // gievn
        ArrayList<Integer> emptyList = new ArrayList<>();
        // when
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        //then
        Assertions.assertEquals(emptyList, listNumbers);
    }
    @DisplayName("when in the list includes are odd and even Numbers " +
                  "then check if the Class is correct")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        // given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 11, 44, 45, 98, 99, 100);
        // ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(2, 4, 6, 44, 98, 100));
        // when
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        // then
        Assertions.assertEquals(listNumbers, listNumbers);
    }
}
