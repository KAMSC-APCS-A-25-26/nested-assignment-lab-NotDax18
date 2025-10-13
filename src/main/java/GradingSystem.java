import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        // TODO: Step 1 - Get the score from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score (0-100):  ");
        int score = sc.nextInt();
        String grade = "";

        if(score < 0 || score > 100){
            grade = "Invalid score";
        }
        else{
            if(score >= 90){
                grade = "A";
                if(score >= 98){
                    grade += "+";
                }
                if(score <=93){
                    grade += "-";
                }
            }
            else if(score >= 80){
                grade = "B";
                if(score >= 88){
                    grade += "+";
                }
                if(score <=83){
                    grade += "-";
                }
            }
            else if(score >= 70){
                grade = "C";
                if(score >= 78){
                    grade += "+";
                }
                if(score <=73){
                    grade += "-";
                }
            }
            else if(score >= 60){
                grade = "D";
                if(score >= 68){
                    grade += "+";
                }
                if(score <=63){
                    grade += "-";
                }
            }
            else{
                grade = "F";
            }

        }
        System.out.println("The grade is: " + grade);





        // TODO: Step 2 - Implement nested if logic for letter grades


        // TODO: Step 3 - Display the result

    }
}