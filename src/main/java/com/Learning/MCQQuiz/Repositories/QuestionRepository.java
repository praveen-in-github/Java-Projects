package com.Learning.MCQQuiz.Repositories;

import com.Learning.MCQQuiz.Models.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionModel,String> {

    List<QuestionModel> findByCategory(String category);
}
