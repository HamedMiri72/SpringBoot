package com.hamed.quizzappfinal.controller;


import com.hamed.quizzappfinal.model.Question;
import com.hamed.quizzappfinal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController

{
    @Autowired
    QuestionService questionService;


    @GetMapping("allQuestions")
    public List<Question> getAllQuestions()
    {
        return  questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category)
    {
           return questionService.getQuestionByCategory(category);
    }

}
