package com.example.test_pipline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestPiplineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestPiplineApplication.class, args);
    }

    @GetMapping("hlow")
    public String hlow() {
        return "hlow";
    }
}
