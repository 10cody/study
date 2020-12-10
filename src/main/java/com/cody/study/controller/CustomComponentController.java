package com.cody.study.controller;

import com.example.customcomponent.CustomComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cody
 * @date 2020/9/24
 */
@RestController
public class CustomComponentController {

    private final CustomComponentService customComponentService;

    public CustomComponentController(CustomComponentService customComponentService) {
        this.customComponentService = customComponentService;
    }

    @GetMapping("/custom/input")
    public String input(String word){
        return customComponentService.wrap(word);
    }
}
