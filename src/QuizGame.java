import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store the user's answers and the correct answers
        char userAnswer;
        int correctAnswers = 0;  // Counter for correct answers
        String[] questions = {
            "Question 1: Which of the following is a country in Africa?\nA. Portugal\nB. Belgium\nC. Netherlands\nD. Nigeria",
            "Question 2: What is the capital city of Nigeria?\nA. Abuja\nB. Oyo\nC. Lagos\nD. Anambra",
            "Question 3: Which medical specialization is focused on treating diseases of the central nervous system?\nA. Cardiothoracic\nB. Trauma and Emergency\nC. Geriatics\nD. Neurology",
            "Question 4: Which of the following is a footballer\nA. Lionel Messi\nB. cardi B\nC. Micheal Jackson\nD. Sharukh Khan",
            "Question 5: What of the following is a car brand?\nA. Toyota\nB. Barcelona\nC. Ulisboa\nD. Google"
        };
        
        char[] correctAnswersKey = {'D', 'A', 'D', 'A', 'A'};  // Array storing the correct answers

        // Iterate through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  // Display each question
            System.out.print("Your answer (A, B, C, or D): ");
            userAnswer = scanner.next().toUpperCase().charAt(0);  // Read user input and convert to uppercase
            
            // Input validation: Ensure the user enters A, B, C, or D
            while (userAnswer != 'A' && userAnswer != 'B' && userAnswer != 'C' && userAnswer != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
                System.out.print("Your answer: ");
                userAnswer = scanner.next().toUpperCase().charAt(0);
            }

            // Check if the user's answer matches the correct answer
            if (userAnswer == correctAnswersKey[i]) {
                System.out.println("Correct!\n");
                correctAnswers++;  // Increment correct answer count
            } else {
                System.out.println("Wrong! The correct answer is: " + correctAnswersKey[i] + "\n");
            }
        }

        // Calculate the final score as a percentage
        double score = (double) correctAnswers / questions.length * 100;

        // Display the final score
        System.out.println("You answered " + correctAnswers + " out of " + questions.length + " questions correctly.");
        System.out.println("Your final score is: " + String.format("%.2f", score) + "%");

        // Close the scanner
        scanner.close();
    }
}
