import java.util.Scanner;

public class P3Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        String grade = getGrade(score);
        System.out.println("Your garde is " + grade);
    }
    
    public static String getGrade(int score) {
        String grade = "";
        
        if(score > 100 || score < 0) {
            grade = "?";
        } else if(score >= 80) {
            grade = "A";
        } else if(score >= 70) {
            grade = "B";
        } else if(score >= 60) {
            grade = "C";
        } else if(score >=50) {
            grade = "D";
        } else if(score < 50) {
            grade = "F";
        } else {
            grade = "";
        }
        
        return grade;
    }

}
