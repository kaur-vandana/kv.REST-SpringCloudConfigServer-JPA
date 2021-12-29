package com.kaur.vandana.microservices.limitsservice.restcontroller;

import com.kaur.vandana.microservices.limitsservice.config.Configuration;
import com.kaur.vandana.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits () {
        return new Limits(1, 1000);
    }

    @GetMapping("/limits-config")
    public Limits retrieveLimitsWithConfiguration () {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
