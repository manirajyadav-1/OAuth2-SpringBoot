package com.mani.SpringOAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String greet(){
        return "Hello OAuth2";
    }
}
