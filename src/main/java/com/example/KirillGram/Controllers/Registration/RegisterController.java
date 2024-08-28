package com.example.KirillGram.Controllers.Registration;

import com.example.KirillGram.Controllers.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class RegisterController {
    List<User>users = new ArrayList<>();
    @GetMapping
    public String getMain(){
        return "register";
    }
    @PostMapping
    public String postMain(Model model, @RequestParam String name, @RequestParam String password){

        for(User user1:users){
            if(user1.getName().equals(name)){
                return "login";
            }
        }
        User user = new User(name,password);
        users.add(user);

        model.addAttribute("name");
        model.addAttribute("password");

        return "afterRegistration";
    }

}
