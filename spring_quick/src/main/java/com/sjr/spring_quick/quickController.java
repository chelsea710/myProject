package com.sjr.spring_quick;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quickController {


    @RequestMapping("/quick")
    public String quick(){
        return "hello world";
    }
}
