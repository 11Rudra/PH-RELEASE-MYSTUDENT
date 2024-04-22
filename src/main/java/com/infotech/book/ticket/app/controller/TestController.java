package com.infotech.book.ticket.app.controller;

import com.infotech.book.ticket.app.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        // some logic here
        throw new CustomException("This is a custom exception");
    }
}