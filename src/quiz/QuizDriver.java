///////////////////////////////////////////////////////////////////////////////                  
// Title:            Quiz
// Files:          JavaApplication9Quiz.java;Quiz.java;Question.java;
//                  MultipleChoiceQuestion.java;MultipleAnswerQuestion.java;
//                  FillBlankQuestion.java
// Semester:         COP3337 Fall 2015
//
// Author:           3587814
// Lecturer's Name:  Prof. Maria Charters
//
// Description of Program’s Functionality: 
//////////////////////////// 80 columns wide/////////////////////////////////

package quiz;

public class QuizDriver {

    public static void main(String[] args) {

        //Create new quiz
        Quiz doom = new Quiz();

        //Create quiz questions
        doom.createQuestions();

        //Display questions to user, receive and check response
        doom.displayAndCheckQuestions();

        //Summarize results
        doom.summarizeResults();
        
    }

}
