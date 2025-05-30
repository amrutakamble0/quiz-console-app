package com.devgen.quiz.model;

//import java.util.Scanner;
import com.devgen.quiz.model.model.Question;

public class QuestionServices
{
private Question[] questions;    //=new Question[10];
private int current;

public QuestionServices(int Size)
{
questions =new Question[Size];
questions[current]=new Question(1,"Q1. Array index starts from?", new String[] {"0", "1", "2", "3"}, "0");
current++;
questions[current]=new Question(2,"Q2. Size of int in java?", new String[] {"1", "2", "4"}, "4");
current++;
questions[current]=new Question(3,"Q3. Size of short in java?",new String[] {"0", "1", "2", "3"}, "2");
current++;
questions[current]=new Question(4,"Q4. Size of double in java?",new String[] {"0", "4", "2", "8"}, "8");
current++;
questions[current]=new Question(5,"Q5. Size of char in java?",new String[] {"2", "4"}, "2");
current++;
}

public String addQuestion(Question question)
{//int length = questions.length;
    questions[current]=question;
    current++;
    return "Question Added Sucessfully...!";
}

public String updatedQuestion(Question question)
{
    return "Question Updated Sucessfully...!";
}

public String deletedQuestion(int id)
{
    return "Question Deleted Sucessfully...!";
}

public Question[] getAllQuestion()
{
    return questions;
}
}
