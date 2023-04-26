package org.taskboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogIn {

    @GetMapping("/login")
    public String LogIn(){ return "login"; }
}
