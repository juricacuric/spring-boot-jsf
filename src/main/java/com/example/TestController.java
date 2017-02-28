package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(path = "/hellow-world", method = RequestMethod.GET)
    public ResponseEntity<String> helloWorldController() {
        return new ResponseEntity<>("Hello world!", HttpStatus.OK);
    }
}
