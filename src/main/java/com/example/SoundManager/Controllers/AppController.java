package com.example.SoundManager.Controllers;


import com.example.SoundManager.EquipmentStuff.Equipment;
import com.example.SoundManager.EquipmentStuff.EquipmentRepository;
import com.example.SoundManager.EquipmentStuff.EquipmentService;
import com.example.SoundManager.UserStuff.User;
import com.example.SoundManager.UserStuff.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
    public class AppController {

        @Autowired
        private UserRepository userRepo;

        @Autowired
        private EquipmentRepository equipRepo;

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

        @GetMapping("/users")
        public String listUsers(Model model) {
            List<User> listUsers = userRepo.findAll();
            model.addAttribute("listUsers", listUsers);

            return "users";
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

    @GetMapping("/viewequipment")
    public String listEquipment(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "viewequipment";
    }

    @GetMapping("/cables")
    public String listCables(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "cables";
    }

    @GetMapping("/poweramps")
    public String listpAmps(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "poweramps";
    }

    @GetMapping("/speakers")
    public String listSpeakers(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "speakers";
    }

    @GetMapping("/microphones")
    public String listMics(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "microphones";
    }

    @GetMapping("/miscl")
    public String listMiscl(Model model) {
        List<Equipment> listEquipment = equipRepo.findAll();
        model.addAttribute("listEquipment", listEquipment);

        return "miscl";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        equipmentService.delete(id);
        return "redirect:/";
    }

}
