package com.example.bluegreencanary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UiController {

    @Value("${background-color}")
    private String backgroundColor;

    @GetMapping()
    public String fetchUi(Model model) {
        model.addAttribute("backgroundcolor", backgroundColor);
        return "ui";
    }
}
