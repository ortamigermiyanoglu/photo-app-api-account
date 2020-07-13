package com.sumutella.photoapp.api.account.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountApiController {
    @GetMapping("/status")
    public String status(){
        return "working mien";
    }
}
