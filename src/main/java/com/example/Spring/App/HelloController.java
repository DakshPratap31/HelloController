package com.example.Spring.App;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Use Case 1: Basic GET Request
    //api :- http://localhost:8080/hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    // Use Case 2: GET Request with Query Parameter
    //Api:-localhost:8080/hello/query?name=Daksh
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}