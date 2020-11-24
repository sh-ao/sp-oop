/**
 * Calculate GPA
 */

public class P5Q1 {
    public static void main(String[] args) {
        String[] grades = {"A","B+","C","D","B"};
        int[] creditUnits = {4, 3, 2, 5, 8};
        
        double[] gradesPoint = gradePoints(grades);
        
        double[] moduleGradePoints = new double[grades.length];
        for(int i = 0; i < gradesPoint.length; i++) {
            moduleGradePoints[i] = gradesPoint[i] * creditUnits[i];
        }
        
        double sumModuleGradePoints = 0;
        for(int i = 0; i < moduleGradePoints.length; i++) {
            sumModuleGradePoints = sumModuleGradePoints + moduleGradePoints[i];
        }
        
        double sumCreditUnit = 0;
        for(int i = 0; i < creditUnits.length; i++) {
            sumCreditUnit = sumCreditUnit + creditUnits[i];
        }
        
        double gpa = sumModuleGradePoints / sumCreditUnit;
        System.out.println("The GPA is " + gpa);
    }
    
    public static double[] gradePoints(String grades[]) {
        double[] gradesPoint = new double[grades.length];
        //enter your logic here
        //hint: use for loop and switch case 
        for(int i = 0; i < grades.length; i++) {
            double gradePoint = 0;
            String grade = grades[i];
            switch(grade) {
                case "A": gradePoint = 4; break;
                case "B+": gradePoint = 3.5; break;
                case "B": gradePoint = 3; break;
                case "C+": gradePoint = 2.5; break;
                case "C": gradePoint = 2; break;
                case "D+": gradePoint = 1.5; break;
                case "D": gradePoint = 1; break;
            }
            gradesPoint[i] = gradePoint;
        }
        return gradesPoint;
    }
}
