package com.saketh.demoproject.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public ResponseEntity<String> showHello(){
        System.out.println("Hello World!");
        return new ResponseEntity<>("Hello World!", HttpStatusCode.valueOf(200));
    }
}
