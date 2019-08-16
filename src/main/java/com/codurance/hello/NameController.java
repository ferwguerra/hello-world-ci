package com.codurance.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/name")
    public String getName() {
        return nameService.getName();
    }

    public void setNameService(NameService nameService) {
        this.nameService = nameService;
    }
}
