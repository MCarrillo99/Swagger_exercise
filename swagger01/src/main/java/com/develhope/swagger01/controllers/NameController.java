package com.develhope.swagger01.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Tag(name = "name", description = "a simple name c")
    @GetMapping(value = "/name_controller")
    public String getMyName(){
        return "Michele Carrillo";
    }
}
