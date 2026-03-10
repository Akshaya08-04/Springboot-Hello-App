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
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from Akshaya";
    }
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
