package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ReqController {
    @GetMapping("/req1")
    public String req1(@RequestParam("p1") String p1, @RequestParam("p2") int p2){
        System.out.println("p1 = " + p1 + "p2 = " + p2);
        return "index";
    }

    ///req2/aaa
    @GetMapping("/req2/{p3}")// 중괄호 표현 p3에 aaa를 담아야 함. "p3"는 그냥 임의로 정해준 변수의 이름
    public String req2(@PathVariable("p3") String p3){
        System.out.println("p3 = " + p3);
        return "index";
    }

    @PostMapping("/req3")
    public String req3(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("dt") int dt){
        System.out.println("name = " + name + " age = " + age + " dt = " + dt);
        System.out.println("might = " + (dt-age));
        return "index";
    }
    @GetMapping("/req4")
    public String req4(Model model){
        model.addAttribute("a1", "스프링부트구나 이게");
        model.addAttribute("a2", "형식이 약간 다르네");
        return "req4"; //templates/req4.html을 호출함
    }

}
