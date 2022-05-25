package org.example.services;


import org.example.dao.QuestionDao;
import org.example.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class LearnerService {

    @Autowired
    private final QuestionDao questionDao;

    public LearnerService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public List<Question> getQuestions() {
        return questionDao.findAll();
    }



    public void reorder() {
        var Q = questionDao.findById(75);
        if(Q.isPresent()) {
            Q.get().setQuestion("Can we assign the reference to this variable?");
            questionDao.save(Q.get());
        }
    }
}
