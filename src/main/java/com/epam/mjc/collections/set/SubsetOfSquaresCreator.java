package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (Integer integer : sourceList) {
            integerTreeSet.add(integer * integer);
        }

        return integerTreeSet.stream().filter(integer1 -> (integer1 >= lowerBound && integer1 <= upperBound)).collect(Collectors.toSet());
    }
}
