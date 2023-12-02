package com.example.Kursowaja2.Controller;

import com.example.Kursowaja2.Modul.Questions;
import com.example.Kursowaja2.Service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;


    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Questions> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
