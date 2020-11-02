package br.com.artur.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping( "/" )
    public String hello() {
        return "hello world!";
    }

    @GetMapping( "/teste" )
    public String hello2() {
        return "teste!";
    }
}
