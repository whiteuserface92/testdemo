package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {

        System.out.println(request.getRequestURI());
        model.addAttribute("message", "Welcome to Spring MVC with JSP!");
        return "home";  // Resolves to /WEB-INF/views/home.jsp
    }
}
