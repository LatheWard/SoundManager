package com.example.SoundManager.Controllers;


import com.example.SoundManager.EquipmentStuff.Equipment;
import com.example.SoundManager.EquipmentStuff.EquipmentService;
import com.example.SoundManager.UserStuff.User;
import com.example.SoundManager.UserStuff.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
    public class AppController {

        @Autowired
        private UserRepository userRepo;

        @Autowired
        EquipmentService equipmentService;

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
        public String showAddEquipmentForm(Model model) {
            model.addAttribute("equipment", new Equipment());
            return "addequipment";
        }

        @RequestMapping(value = "/addedequipment", method = RequestMethod.POST)
        public String processAddEquipment(@ModelAttribute("equipment") Equipment equipment) {
            equipmentService.saveEquipment(equipment);
            return "redirect:/";
        }


    }
