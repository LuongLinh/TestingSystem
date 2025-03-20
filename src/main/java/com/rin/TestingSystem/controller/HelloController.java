package com.rin.TestingSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // đánh dấu thuộc layer controller
@RequestMapping("hello") // tạo đường dấn tới Controller
public class HelloController {

    @GetMapping // đánh dấu method này xử lý cho phương thức get
    public String helloWorld() {
        return "Hello World";
    }
}
