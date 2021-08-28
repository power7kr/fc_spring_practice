package com.fc.springpractice;

import com.fc.springpractice.config.Config;
import com.fc.springpractice.logic.BubbleSort;
import com.fc.springpractice.logic.Sort;
import com.fc.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) {
//        //Annotation기반으로 작동하는 Context
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        SortService sortService = context.getBean(SortService.class);
//
//        System.out.println("[Result] : " + sortService.doSort(Arrays.asList(args)));
//    }
//}
