package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope("request")
public class HelloWorldView implements Serializable {

    public String getMessage() {
        return "Hello World from managed bean or whatever this is!";
    }
}
