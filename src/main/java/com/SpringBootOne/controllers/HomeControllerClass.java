package com.SpringBootOne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControllerClass {

    @GetMapping("/")
    public ModelAndView home(Model model ){
        //View resovler will search for the home.jsp in the path defined in application.properties
        model.addAttribute("message", "This message is set as an attribute in the model");
        ModelAndView mav = new ModelAndView("home");

        //It is possible to set return type to String and return value to "home" for the view resolver to create right view type automatically

        return mav;
    }
}
