package com.example.SoundManager.Controllers;


import EquipmentStuff.Equipment;
import com.example.SoundManager.UserStuff.User;
import com.example.SoundManager.UserStuff.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
    public class AppController {

        @Autowired
        private UserRepository userRepo;

        @GetMapping("")
        public String viewHomePage() {
            return "index";
        }

        @GetMapping("/register")
        public String showRegistrationForm(Model model) {
            model.addAttribute("user", new User());

            return "signup_form";
        }

        @PostMapping("/process_register")
        public String processRegister(User user) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);

            userRepo.save(user);

            return "register_success";
        }

    @GetMapping("/addequipment")
    public String showAddequipmentForm(Model model) {
        model.addAttribute("equipment", new Equipment());

        return "addequipment";
    }
    }
