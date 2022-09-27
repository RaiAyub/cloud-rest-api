package com.amazon.web.cloudrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    public Result add(int a, int b){
        Result result = new Result();
        int sum=a+b;
        String message = "Sum of : " +a+ " & "+b+ " is " +sum;
        result.setMathResult(sum);
        result.setMessage(message);
        return result;
    }
}
