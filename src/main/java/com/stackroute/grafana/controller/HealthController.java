package com.stackroute.grafana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class HealthController {

    @GetMapping("/health")
    public String getHealth(){
//        try{
//            boolean condition=true;
//            while(condition)
//            {
//                Runnable r=()->{
//                    while(true){}
//                };
//            new Thread(r).start();
//            Thread.sleep(5000);
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return "welcome to stackroute";
    }
}
