package com.fc.springpractice.service;

import com.fc.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test(){

        //when
        var actual = sut.doSort(List.of("3","2","1"));

        //then
        assertEquals(List.of("1","2","3"), actual);
    }

}