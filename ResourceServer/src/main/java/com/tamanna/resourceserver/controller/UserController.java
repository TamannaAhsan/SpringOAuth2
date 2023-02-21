package com.tamanna.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/resource")
    public String getResource() {
        return "protected resource from resource server, only shown after authorization from owner ";
    }
}
