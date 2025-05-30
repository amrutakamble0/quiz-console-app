package com.devgen.quiz.model.client;
import com.devgen.quiz.model.model.Question;
import com.devgen.quiz.model.QuestionServices;


public class QuestionServiceClient {
    public static void main(String[] args) {
        
        QuestionServices questionServices = new QuestionServices(10);
        Question question1=new Question(6, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question1);

         Question question2=new Question(7, "Java is short for JavaScript?", new String[] {"True", "False"}, 2);
        questionServices.addQuestion(question2);

         Question question3=new Question(8, "How do you insert COMMENTS in Java code", new String[] {"# this is comment", "/*This is comment", "//This is comment"}, 3);
        questionServices.addQuestion(question3);

         Question question4=new Question(9, "How do you create a variable with the numeric value 5?", new String[] {"num x=5", "float x=5", "x=5", "int x=5"}, 1);
        questionServices.addQuestion(question4);

         Question question5=new Question(10, "Which method can be used to find the length of a string?", new String[] {"strlen()", "len()", "getSize()", "getlen()"}, 1);
        questionServices.addQuestion(question5);


        Question[] questions=questionServices.getAllQuestion();

        Question originalQuestion=questions[1];
        originalQuestion.setAnswer(2);//Upadted new answer.
        originalQuestion.setQuestion("What is the size of short in java?");//Updated new question.

        questionServices.updatedQuestion(originalQuestion);

        questions=questionServices.getAllQuestion();
        for(Question q :questions)
        System.out.println(q);
        System.out.println("-----------------------------------------------------------------------------------");

        questionServices.deletedQuestion(4);
        questionServices.deletedQuestion(8);
        questionServices.deletedQuestion(1);
        questionServices.deletedQuestion(2);

        questions=questionServices.getAllQuestion();
        for(Question q :questions)
        System.out.println(q);
    }
    
}
