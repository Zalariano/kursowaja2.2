package com.example.Kursowaja2.Service;

import com.example.Kursowaja2.Modul.Questions;

import java.util.Collection;

public interface QuestionService {
    Questions add(String question, String answer);
    Questions add(Questions question);
    Questions remove(String question, String answer);
    Collection<Questions> getAll();
    Questions getRandomQuestion();
}
