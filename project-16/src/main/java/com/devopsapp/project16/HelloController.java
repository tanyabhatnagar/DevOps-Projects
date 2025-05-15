package com.devopsapp.project16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Map<String, String> hello() {
        logger.info("Received request on /hello endpoint");
        return Map.of("message", "Hello from DevOps Project 16!");
    }
}

