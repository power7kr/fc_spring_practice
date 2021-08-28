package com.fc.springpractice.controller;

import com.fc.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    //파라미터를 Spring이 알아서 넣어준다.
    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    //@GetMapping으로 localhost:8080에 들어가자마자 다음 함수를 요청하게 된다.
    //그런데 @RequestParam으로 주소창에 입력한 파라미터를 받는다.
    //따라서 그냥 /으로 들어가버리게 되면 400오류가 발생한다.
    //다음과 같이 파라미터를 리스트로 줄 수 있다.
    // localhost:8080/?list = 3,2,1
    public String hello(@RequestParam List<String> list){
        return sortService.doSort(list).toString();
    }
}
