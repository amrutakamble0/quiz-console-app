package com.devgen.quiz.model.client;

import com.devgen.quiz.model.QuestionServices;
import com.devgen.quiz.model.model.QuizResult;
import com.devgen.quiz.model.service.QuizService;
import com.devgen.quiz.model.client.QuizAppclient;

public class QuizAppclient
{

    public static void main(String[] args)
    {
        QuestionServices questionServices=new QuestionServices(5);
        QuizService quizService=new QuizService(questionServices);
        quizService.playQuiz();
        QuizResult result= quizService.getResult();

        System.out.println("Total correct answers: "+result.getCorrectAnswers());
        System.out.println("total Incorrect answers: "+result.getIncorrectAnswers());
        System.out.println("Percentage: "+result.getPercentage());
        System.out.println("Suggestions: "+result.getSuggestion());

    }
}

