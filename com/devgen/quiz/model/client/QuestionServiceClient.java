package com.devgen.quiz.model.client;
import com.devgen.quiz.model.model.Question;
import com.devgen.quiz.model.QuestionServices;


public class QuestionServiceClient {
    public static void main(String[] args) {
        
        QuestionServices questionServices = new QuestionServices(100);
        Question question1=new Question(6, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question1);

         Question question2=new Question(7, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question2);

         Question question3=new Question(8, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question3);

         Question question4=new Question(9, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question4);

         Question question5=new Question(10, "Java developed in?", new String[] {"1998", "1997", "1996", "1995"}, 4);
        questionServices.addQuestion(question5);

    }
    
}
