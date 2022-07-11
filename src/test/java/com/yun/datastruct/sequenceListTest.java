package com.yun.datastruct;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sequenceListTest {
    @Test
    public void testAdd(){
        sequenceList<Integer> integersequenceList = new sequenceList<>();
        integersequenceList.add(0, 1);
        integersequenceList.add(0, 2);
        integersequenceList.add(2, 3);
        System.out.println(integersequenceList);
    }
}