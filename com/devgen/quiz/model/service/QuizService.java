package com.devgen.quiz.model.service;

import java.util.Scanner;

import com.devgen.quiz.model.QuestionServices;
import com.devgen.quiz.model.model.Question;
import com.devgen.quiz.model.model.QuizResult;

public class QuizService
 {
    private String[] userSelectedAnswer =new String[5];
    private Question[] questions;
    private QuestionServices questionServices;

     public QuizService(QuestionServices questionServices)
     {
          this.questionServices=questionServices;
         // QuestionServices questionServices=new QuestionServices();
          questions = this.questionServices.getAllQuestion();
     }
     //PlayQuiz Function Starts here...
   public void playQuiz()
   {
      Scanner scanner = new Scanner(System.in);
 
      for(int i=0; i < questions.length; i++)
      {
         Question question=null;
      // System.out.println(questions[i]);
      System.out.println("Question: " +questions[i].getId());
      System.out.println(questions[i].getQuestion());

      System.out.println(questions[i].getOption1());
      System.out.println(questions[i].getOption2());
      System.out.println(questions[i].getOption3());
      System.out.println(questions[i].getOption4());

       userSelectedAnswer[i]= scanner.next();
    }
 scanner.close();
}
//getResult Function Starts here...
public QuizResult getResult ()
{
    int correctAnswers = 0;
    for(int i=0;i<userSelectedAnswer.length;i++)
    {
         if(questions[i].getAnswer().equals(userSelectedAnswer[i]))
         {
            correctAnswers++;
         }
    }

int incorrectAnswer = questions.length - correctAnswers;
double percentage=((double)correctAnswers / questions.length) * 100;
String suggestion=getSuggestion(percentage);
QuizResult QuizResult=new QuizResult(correctAnswers, incorrectAnswer, percentage, suggestion);

return QuizResult;
} 

//getSuggestion() starts here...
private String getSuggestion(double percentage)
{
String suggestion=" ";

if(percentage >=0 && percentage<=30)
{
 suggestion="You have study much harder.";
}
else if(percentage>=31 && percentage<=60)
{
  suggestion="You are studying good. Need to do study more.";
}
else if(percentage>=61 && percentage<=90)
{
  suggestion=" You are becoming a topper and just bit of extra efforts lttle required.";
}
else
{
  suggestion=" You are very good at concept and being into top list";
}
return suggestion;
}

}
