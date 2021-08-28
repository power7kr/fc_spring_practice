package com.fc.springpractice.service;

import com.fc.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//Service에 특화된 Bean
@Service
public class SortService {

    private final Sort<String> sort;

    //@Qualifier : 이름기준으로 Bean을 주입
    //인자로 사용되는 이름 : Bean의 Component에 인자로서 집어넣으면 그것이 이름이 된다.
    public SortService(@Qualifier("thisComponent") Sort<String> sort){
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
