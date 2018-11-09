package com.kyj.demo.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RefreshScope 
@RestController
public class HelloController {
	@Value("${kyj.hello}")
    private String hello;

    @RequestMapping("/git")
    public String from() {
        return "git2--"+this.hello;
    }
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
    	try{
            Thread.sleep(10000);
        }catch ( Exception e){
            log.error(" hello two error",e);
        }
        return "hello "+name+"，this is second messge";
    }
}
