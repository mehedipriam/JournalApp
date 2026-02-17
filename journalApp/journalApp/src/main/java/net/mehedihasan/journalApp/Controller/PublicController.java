package net.mehedihasan.journalApp.Controller;

import net.mehedihasan.journalApp.entity.User;
import net.mehedihasan.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String HealCheck(){
        return "OK";
    }

    @PostMapping("create-user")
    public void createUser(@RequestBody User user){
        userService.saveEntry(user);
    }

}
