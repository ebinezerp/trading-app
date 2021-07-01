package wipro.training.assignmentonemonolithtradingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wipro.training.assignmentonemonolithtradingapp.exceptions.InvalidCredentialsException;
import wipro.training.assignmentonemonolithtradingapp.model.User;
import wipro.training.assignmentonemonolithtradingapp.service.UserService;

@Controller
public class RegisterController {

    private UserService userService;

    public RegisterController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("user", new User());
        return "signup";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/signup")
    public String saveUser(@ModelAttribute("user") User user, Model model){
        try {
            userService.saveUser(user);
        }catch (NullPointerException e){
            model.addAttribute("error", e.getMessage());
            model.addAttribute("user", user);
            return "signup";
        }
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String authenticateUser(@RequestParam("username")String username, @RequestParam("password")String password, Model model){
        try{
            User user = userService.authenticate(username, password);
            return "redirect:/home";
        }catch (InvalidCredentialsException ex){
            model.addAttribute("error", ex.getMessage());
            return "login";
        }
    }

}
