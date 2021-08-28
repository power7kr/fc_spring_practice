package com.fc.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Bean 등록하기
@Component
public class JavaSort <T extends Comparable<T>> implements com.fc.springpractice.logic.Sort<T> {
    @Override
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);

        //Using TimSort
        Collections.sort(output);

        return output;
    }
}
