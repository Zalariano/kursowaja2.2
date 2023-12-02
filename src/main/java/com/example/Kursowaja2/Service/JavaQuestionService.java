package com.example.Kursowaja2.Service;

import com.example.Kursowaja2.Modul.Questions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

@Service

public class JavaQuestionService implements QuestionService {

    private final Collection<Questions> questions = new HashSet<>();

    @Override
    public Questions add(String question, String answer) {
        Questions newQuestion = new Questions(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Questions add(Questions question) {
        questions.add(question);
        return question;
    }

    @Override
    public Questions remove(String question, String answer) {
        Questions questionForRemove = new Questions(question, answer);
        questions.remove(questionForRemove);
        return questionForRemove;
    }

    @Override
    public Collection<Questions> getAll() {
        return questions;
    }

    @Override
    public Questions getRandomQuestion() {
        int randomIdx = new Random().nextInt(questions.size());
        return new ArrayList<>(questions).get(randomIdx);
    }
}
