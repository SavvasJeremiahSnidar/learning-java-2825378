import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the best season of the year?";
        String choiceOne = "Winter";
        String choiceTwo = "Spring";
        String choiceThree = "Summer";
        String choiceFour = "Fall";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        System.out.println();
        // Write a print statement giving the answer choices
        System.out.println("" + choiceOne);
        System.out.println("" + choiceTwo);
        System.out.println("" + choiceThree);
        System.out.println("" + choiceFour);


        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String answer = input.next();
        // If the user's input matches the correctAnswer...
        if(answer.equals(correctAnswer.toLowerCase())) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Try again");
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
