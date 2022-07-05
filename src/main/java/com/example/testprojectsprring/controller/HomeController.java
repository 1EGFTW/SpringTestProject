package com.example.testprojectsprring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHome(){
        return "randomstring";
    }
    @GetMapping("/new")
    public List<Integer> getNewString(){
        List<Integer> result=new LinkedList<>();
        for(int i=0;i<10;i++){
            result.add(i);
        }
        return result;
    }
}
