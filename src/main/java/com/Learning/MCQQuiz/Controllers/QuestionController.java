package com.Learning.MCQQuiz.Controllers;

import com.Learning.MCQQuiz.Models.QuestionModel;
import com.Learning.MCQQuiz.Services.QuestionService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("questions")
    public List<QuestionModel> getQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("questions?category={category}")
    public List<QuestionModel> getQuestionsByCategory(@RequestParam String category){
        return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("question")
    public QuestionModel addQuestionHandler(@RequestBody QuestionModel question){
        return questionService.save(question);
    }
}
