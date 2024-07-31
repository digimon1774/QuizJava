import java.util.Scanner;

public class W12 {
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
        } else if (score > 79) {
            return "A";
        } else if (score > 74) {
            return "B+";
        } else if (score > 69) {
            return "B";
        } else if (score > 64) {
            return "C+";
        } else if (score > 59) {
            return "C";
        } else if (score > 54) {
            return "D+";
        } else if (score > 49) {
            return "D";
        } else {
            return "E";
        }
    }
}