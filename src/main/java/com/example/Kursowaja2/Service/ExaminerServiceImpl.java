package com.example.Kursowaja2.Service;

import com.example.Kursowaja2.Modul.Questions;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Questions> getQuestions(int size) {
        Collection<Questions> result = new HashSet<>();
        while (result.size() <= size){
            result.add(questionService.getRandomQuestion());
        }
        return result;
    }
}