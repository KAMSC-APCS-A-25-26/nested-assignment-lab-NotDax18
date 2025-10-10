import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade = "";
        String modifier = "";
        int score;
        System.out.println("Please enter a score between 0 and 100: ");
        score = scan.nextInt();
        if (score < 60) {
            grade = "F";
        }



        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                modifier = "+";
            } else if (score >= 94) {
                modifier = "";
            } else {
                modifier = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                modifier = "+";
            } else if (score >= 84) {
                modifier = "";
            } else {
                modifier = "-";
            }
        } else if (score >= 70) {
            grade = "C";
            if (score >= 78) {
                modifier = "+";
            } else if (score >= 74) {
                modifier = "";
            } else {
                modifier = "-";
            }
        } else if (score >= 60) {
            grade = "D";
            if (score >= 68) {
                modifier = "+";
            } else if (score >= 64) {
                modifier = "";
            } else {
                modifier = "-";
            }
        }
        System.out.println("The grade is: " + grade+modifier);
    }


}

