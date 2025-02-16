package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


    // http://localhost:8080/greeting?name=User
    // http://localhost:8080/greeting
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required=false,defaultValue ="World") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

    //http://localhost:8080/
    // Get your greeting here


}
