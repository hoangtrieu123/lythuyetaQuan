package com.example.demo_spring_project.controller;

import com.example.demo_spring_project.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/hello1")
    public String home1() {
       return "display";
    }

    @GetMapping("/hello2")
    public String home2(Model a) {
        Product p = new Product("Triều");
        a.addAttribute("name", "C0422H1");
        a.addAttribute("p", p);
        return "display";
    }

    @GetMapping("/hello3")
    public ModelAndView home3() {
        ModelAndView modelAndView = new ModelAndView("display");
        Product p = new Product("CodeGym");
        modelAndView.addObject("name", "HelloWorld");
        modelAndView.addObject("p", p);
        return modelAndView;
    }

    @GetMapping("/hello4")
    public String home4(ModelMap model) {
        Product p = new Product("demo");
        model.addAttribute("name", "test");
        model.addAttribute("p", p);
        return "display";
    }

    @RequestMapping(value = "/hello5", method = RequestMethod.POST)
    public String home5(ModelMap model) {
        Product p = new Product("demo");
        model.addAttribute("name", "test");
        model.addAttribute("p", p);
        return "display";
    }

}
