package org.example.services;

import org.example.entities.Question;

import java.util.List;

public interface ILearnerService {

    List<Question> getQuestions();
}
