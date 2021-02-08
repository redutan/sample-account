package com.nhn.rookie8.sample.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello Account!";
    }
}
