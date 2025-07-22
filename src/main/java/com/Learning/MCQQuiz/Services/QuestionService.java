package com.Learning.MCQQuiz.Services;

import com.Learning.MCQQuiz.Models.QuestionModel;
import com.Learning.MCQQuiz.Repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    public List<QuestionModel> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<QuestionModel> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public QuestionModel save(QuestionModel question) {
        return questionRepository.save(question);
    }
}
