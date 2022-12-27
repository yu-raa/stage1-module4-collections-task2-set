package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet
                = firstSet.stream().filter(str -> (secondSet.contains(str) && !thirdSet.contains(str))).collect(Collectors.toSet());
        newSet.addAll(thirdSet.stream().filter(str -> (!firstSet.contains(str) && !secondSet.contains(str))).collect(Collectors.toSet()));
        return newSet;
    }
}
