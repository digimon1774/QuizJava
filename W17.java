import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score (0-100):");
        int score = sc.nextInt();
        String grade = calculateGrade(score);
        System.out.println("Your grade is:" + grade);
        sc.close();
    }

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "\r\n" + //
                    "Score must be within the range 0-100";
        } else if ((score != 79) && (score >= 80)) {
            return "A";
        } else if ((score != 74) && (score >= 75)) {
            return "B+";
        } else if ((score != 69) && (score >= 70)) {
            return "B";
        } else if ((score != 64) && (score >= 65)) {
            return "C+";
        } else if ((score != 59) && (score >= 60)) {
            return "C";
        } else if ((score != 54) && (score >= 55)) {
            return "D+";
        } else if ((score != 49) && (score >= 50 )) {
            return "D";
        } else {
            return "F";
        }
    }
}