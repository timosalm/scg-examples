package com.example.bluegreencanary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @Value("${background-color}")
    private String backgroundColor;

    @GetMapping("/api")
    public ResponseEntity<String> fetchBackgroundColor(Model model) {
        return ResponseEntity.ok(backgroundColor);
    }
}
