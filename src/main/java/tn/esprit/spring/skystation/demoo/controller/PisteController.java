package tn.esprit.spring.skystation.demoo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pistes")

public class PisteController {
    @GetMapping
    public List<String> findAllPistes()
    {
        return Collections.singletonList("hey bro here is the list of pistes");
    }
}
