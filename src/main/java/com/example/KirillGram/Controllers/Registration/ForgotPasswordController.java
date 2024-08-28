package com.example.KirillGram.Controllers.Registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ForgotPasswordController {
    @GetMapping("/forgotPassword")
    public String getForgot(){
        return "forgotPassword";
    }

}
