package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {
    @GetMapping("/all")
    public List<String> getNames(){
        return List.of("one","two","three");

    }

}
