package com.amazon.web.cloudrestapi.controller;

import com.amazon.web.cloudrestapi.service.MathService;
import com.amazon.web.cloudrestapi.service.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private MathService mathService;

    @PostMapping("/")
    public Result getAdditionResult(@RequestParam(name="a") int a, @RequestParam(name="b") int b){
        Result result = mathService.add(a,b);
        return result;
    }
}
