package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;


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
        ArrayList<Integer> emptyList = new ArrayList<>();                            // gievn
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);     // when
        System.out.println("Test in progress..." + listNumbers);
        Assertions.assertEquals(emptyList, listNumbers);                                    //then
    }
    @DisplayName("when in the list includes are odd and even Numbers " +
                  "then check if the Class is correct")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9, 11, 44, 45, 98, 99, 100));  // given
        ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(2, 4, 6, 44, 98, 100));
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);                          // when
        System.out.println("Test in progress..." + listNumbers);
        Assertions.assertEquals(oddList, listNumbers);                                                      // then

    }
}
