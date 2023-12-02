package com.example.Kursowaja2.Controller;

import com.example.Kursowaja2.Modul.Questions;
import com.example.Kursowaja2.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Questions add(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Questions remove(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(question, answer);
    }

    @GetMapping
    public Collection<Questions> getAll() {
        return questionService.getAll();
    }
}
