package com.kyj.demo.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope 
@RestController
public class HelloController {
	@Value("${kyj.hello}")
    private String hello;

    @RequestMapping("/git")
    public String from() {
        return "git1--"+this.hello;
    }
    
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
    
}
