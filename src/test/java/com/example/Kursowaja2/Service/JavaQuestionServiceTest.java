package com.example.Kursowaja2.Service;

import com.example.Kursowaja2.Modul.Questions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private final JavaQuestionService javaQuestionService = new JavaQuestionService();


    @Test
    void add() {
        String question = "question";
        String answer = "answer";

        Questions expectedQuestion = new Questions(question, answer);

        Questions actualQuestion = javaQuestionService.add(question, answer);
        assertEquals(expectedQuestion, actualQuestion);
    }

    @Test
    void testAdd() {
        String question1 = "question";
        String answer1 = "answer";
        Questions question = new Questions(question1, answer1);
        Questions actualQuestion = javaQuestionService.add(question);
        Assertions.assertEquals(question, actualQuestion);

    }

    @Test
    void remove() {
        String question = "question";
        String answer = "answer";

        Questions expectedQuestion = new Questions(question, answer);
        javaQuestionService.add(question, answer);

        Questions actualQuestion = javaQuestionService.remove(question, answer);
        assertEquals(expectedQuestion, actualQuestion);
    }

    @Test
    void getAll() {
        Collection<Questions> expectedSet  = new HashSet<>();
        Collection<Questions> actualSet = javaQuestionService.getAll();
        assertEquals(expectedSet, actualSet);
    }
}