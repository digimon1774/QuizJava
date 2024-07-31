import java.util.Scanner;

public class W23 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("กรอกเลขคะแนนของเจ้าามา เดี๋ยวข้าจะแปลงเป็นเกรดให้");
        double studentScore = inputScanner.nextDouble();

        String studentGrade = calculateGrade(studentScore);
        System.out.println("Your grade is: " + studentGrade);
    }

    public static String calculateGrade(double score) {
        if (isA(score)) {
            return "A";
        } else if (isBPlus(score)) {
            return "B+";
        } else if (isB(score)) {
            return "B";
        } else if (isCPlus(score)) {
            return "C+";
        } else if (isC(score)) {
            return "C";
        } else if (isDPlus(score)) {
            return "D+";
        } else if (isD(score)) {
            return "D";
        } else if (isF(score)) {
            return "F";
        } else {
            return "E";
        }
    }

    public static boolean isA(double score) {
        return score != 79 && score >= 80;
    }

    public static boolean isBPlus(double score) {
        return score != 74 && score >= 75;
    }

    public static boolean isB(double score) {
        return score != 69 && score >= 70;
    }

    public static boolean isCPlus(double score) {
        return score != 64 && score >= 65;
    }

    public static boolean isC(double score) {
        return score != 59 && score >= 60;
    }

    public static boolean isDPlus(double score) {
        return score != 54 && score >= 55;
    }

    public static boolean isD(double score) {
        return score != 49 && score >= 50;
    }

    public static boolean isF(double score) {
        return score >= 40 && score < 50;
    }
}