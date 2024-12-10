package org.example.springtraining.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

//@RestController // @Controller + @ResponseBody
@Controller
//@RequestMapping("/memos") // Prefix
public class MemoController {

    @PostMapping
    public void createMemo() {
        System.out.println("hello");
//        System.out.println(requestDto);
    }

    @GetMapping("/memos")
    public String showMemo() {

        return "memos";
    }
}
