package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DemoController {   //-> 기본생성자
    //생성자 주입 -> 필드주입과는 주입되는 '타이밍'이 다르긴한데.. 사용하는 입장에서는 차이점 잘 못느낌
//    private DemoService demoService;

    //Demoservice 객체를 매개변수로 하는 생성자
//    @Autowired
//    public DemoController(DemoService demoService){
//        this.demoService = demoService;
//    } // -> 기본생성자가 없어짐(demoService를 매개변수로 받는 생성자를 만들었기 때문에)
        //그래서 springboot는 확인함. 얘가 생성자인가? (Autowired 덕분에.)

    //생성자 주입 좀 더 편하게
//    private final DemoService demoService; // @Controller와 @RequiredArgsConstructor 라는 Annotation을 주기 (Lombok Library에서 적용함)(final이 붙은 객체만 생성자가 만들어짐)
//    private DemoService1 demoService1;
//    private final DemoService2 demoService2;
//    public DemoController(DemoService demoService, DemoService2 demoService2) {
//        this.demoService = demoService;
//        this.demoService2 = demoService2;
//    } //이런 모양.
    //다른 클래스를 사용하려면, 객체생성을 하되 'final'을 붙여 선언해라.(const느낌으로 더이상 바뀌지 않음)



}
