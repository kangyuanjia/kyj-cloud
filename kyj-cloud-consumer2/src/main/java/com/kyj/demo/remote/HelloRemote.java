package com.kyj.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "kyj-cloud-producer2", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
	
    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}