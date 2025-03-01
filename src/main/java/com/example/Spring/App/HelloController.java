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

    // Use Case 3: GET Request with Path Variable
    //Api:-localhost:8080/hello/param/daksh
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    /*Use Case 4: POST Request with JSON Body
    Api:- localhost:8080/hello/post
    json:-{"firstName":"Daksh",
"lastName":"Pratap"}
    */
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}