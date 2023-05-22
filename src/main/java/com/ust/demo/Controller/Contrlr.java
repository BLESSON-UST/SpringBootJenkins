package com.ust.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Contrlr {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome Blesson";
    }
    @GetMapping("/blesson")
    public String welcomeAadil(){
        return "welcome Blesson J A";
    }

    @GetMapping("/myname")
    public String welcomebless(){
        return "welcome Bless J A";
    }
}
