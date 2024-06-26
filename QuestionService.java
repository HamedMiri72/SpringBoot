package com.hamed.quizzappfinal.service;


import com.hamed.quizzappfinal.dao.QuestionDao;
import com.hamed.quizzappfinal.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionDao questionDao;


    public List<Question> getAllQuestions()
    {
        return questionDao.findAll();
    }


    public List<Question> getQuestionByCategory(String category)
    {
        return questionDao.findByCategory(category);
    }
}
