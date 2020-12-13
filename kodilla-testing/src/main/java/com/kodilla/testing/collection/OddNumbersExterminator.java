package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate (List<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }

