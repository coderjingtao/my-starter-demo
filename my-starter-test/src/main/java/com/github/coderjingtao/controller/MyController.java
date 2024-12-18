package com.github.coderjingtao.controller;

import com.github.coderjingtao.core.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joseph.Liu
 */
@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/user/{name}")
    @ResponseBody
    public String call(@PathVariable("name") String name){
        System.out.println("hello "+name);
        myService.printMessage();
        return "hello "+name;
    }
}
