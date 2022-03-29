package com.spring.controller;

import com.spring.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello/dto")
    public HelloResponseDto hello(@RequestParam("name") String name,
                                  @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
