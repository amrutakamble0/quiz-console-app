package com.devgen.quiz.model.model;

import java.util.Arrays;

public class Question
{
     private int id;
     private String question;
     private String[] options;
     private int answer;//int makes a gives the answer option no thats why made it integer.
    // private String category;
     
     public Question(int id, String question, String[] options, int answer) {
          this.id = id;
          this.question = question;
          this.options = options;
          this.answer = answer;
     }

     public int getId() {
          return id;
     }

     public String getQuestion() {
          return question;
     }

     public void setQuestion(String question) {
          this.question = question;
     }
     
     public int getAnswer() {
          return answer;
     }

     public String[] getOptions() {
          return options;
     }

     @Override
     public String toString() {
          return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
                    + answer + "]";
     }

     
}


