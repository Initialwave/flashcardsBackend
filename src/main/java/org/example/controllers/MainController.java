package org.example.controllers;

import org.example.entities.Question;
import org.example.services.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    LearnerService learnerService;

    @GetMapping("/questions/getAll")
    @CrossOrigin
    public List<Question> getProducts() {
        return learnerService.getQuestions();
    }
    @GetMapping("/")
    public void renum() {

        learnerService.reorder();
    }
}
