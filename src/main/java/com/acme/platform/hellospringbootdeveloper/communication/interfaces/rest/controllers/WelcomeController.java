package com.acme.platform.hellospringbootdeveloper.communication.interfaces.rest.controllers;

import com.acme.platform.hellospringbootdeveloper.communication.domain.model.entities.WelcomeBuilder;
import com.acme.platform.hellospringbootdeveloper.communication.interfaces.rest.resources.WelcomeResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {

    @GetMapping
    public String welcomeDeveloper() {
        return WelcomeBuilder.build(null);
    }

    @GetMapping("{name}")
    public WelcomeResource welcomeDeveloper(@PathVariable String name) {
        return new WelcomeResource(name);
    }

}
