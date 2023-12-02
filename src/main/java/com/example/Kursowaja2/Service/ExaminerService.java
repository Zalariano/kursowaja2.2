package com.example.Kursowaja2.Service;

import com.example.Kursowaja2.Modul.Questions;

import java.util.Collection;

public interface ExaminerService {
    Collection<Questions> getQuestions(int size);
}
