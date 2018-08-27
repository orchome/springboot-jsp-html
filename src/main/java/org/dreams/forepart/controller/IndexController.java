package org.dreams.forepart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/jsp")
    public String jsp(Model model) {
        model.addAttribute("message", "this is index jsp page!");
        return "index";
    }

    @GetMapping("/html")
    public String testThemleaf(Model model) {
        model.addAttribute("message", "this is index html page!");
        return "html/index";
    }
}