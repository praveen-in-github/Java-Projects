package com.Learning.MCQQuiz.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QuestionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String questionTitle;
    private String rightAnswer;
    private String option1,option2,option3,option4;
    private String difficultylevel;
    private String category;

}
