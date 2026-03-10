package com.bridgelabz.helloapp.controller;

import com.bridgelabz.helloapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
//uc1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Akshaya";
    }
    //uc2
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from Akshaya";
    }
    //uc3
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from Akshaya";
    }
    //uc4
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    //uc5
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
