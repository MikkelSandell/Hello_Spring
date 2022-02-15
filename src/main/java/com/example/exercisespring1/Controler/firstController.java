package com.example.exercisespring1.Controler;

import com.example.exercisespring1.Services.CalculateDey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/Hallo")
    public String Hallo(){
        return "Hallo";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String indput){
        return "indput: " + indput;
    }

    @GetMapping("/erdetfredag")
    public String fredag(@RequestParam int day, int month, int year){
        CalculateDey calculateDey = new CalculateDey();
        return calculateDey.Zellercongruence(day,month,year);
    }
}
