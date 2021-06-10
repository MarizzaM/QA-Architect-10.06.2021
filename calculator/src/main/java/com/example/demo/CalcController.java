package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class CalcController {
    @GetMapping("/add")

    public String getadd (@RequestParam(value = "a", defaultValue = "0") Integer a,
                      @RequestParam(value = "b", defaultValue = "0") Integer b) {
        Calculator calculator = new Calculator();
        return String.format("{x: %d, y: %d, sum: %d}", a, b, calculator.add(a,b));
    }


    @PostMapping("/mul")
    public String postmul(@RequestBody MulDTO sent)
    {
        Calculator calculator = new Calculator();
        return String.format("{x: %d, y: %d, mul: %d}", sent.getNum1(), sent.getNum2(),
                calculator.mul(sent.getNum1(),sent.getNum2()));
//        {
//            "num1": 2,
//            "num2": 3
//        }
    }
}
