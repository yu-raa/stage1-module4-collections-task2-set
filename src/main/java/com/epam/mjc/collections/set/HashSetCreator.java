package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                int num = integer;
                do {
                    integerHashSet.add(num);
                    num /= 2;
                }
                while (num % 2 == 0);
                integerHashSet.add(num);
            }
            else {
                integerHashSet.add(integer);
                integerHashSet.add(integer * 2);
            }
        }

        return integerHashSet;
    }
}
