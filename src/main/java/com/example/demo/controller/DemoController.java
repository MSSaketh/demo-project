package com.example.demo.controller;

import com.example.demo.feign.client.FootballApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.constant.Constants.GET_PLAYER;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${football.apiKey}")
    private String apiKey;

//    @Autowired
//    private FootballApiClient footballApiClient;

    @GetMapping("/get")
    public String getMessage(){
        return "Hello World!!";
    }

//    @GetMapping("/getPlayer")
//    public ResponseEntity<Object> getPlayerDetails(@PathVariable String playerName){
//        System.out.println("playerName: "+playerName);
//        return new ResponseEntity<Object>(footballApiClient.getPlayerDetails(GET_PLAYER, playerName, apiKey), HttpStatus.OK);
//    }
}
