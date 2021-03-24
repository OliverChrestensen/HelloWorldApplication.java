package com.example.demo.controllers;

import com.example.demo.Services.WorldSimplestCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculateController {
    WorldSimplestCalculator myCalculator = new WorldSimplestCalculator();

    @ResponseBody
    @GetMapping("Calc")
    public int calculateController(){
        return myCalculator.ComputerAndReturnDoubleAmount(5);
    }
}
