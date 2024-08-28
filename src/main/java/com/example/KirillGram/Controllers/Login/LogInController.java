package com.example.KirillGram.Controllers.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {
    @GetMapping("login")
    public String getLogIn(){
        return "login";
    }

}
