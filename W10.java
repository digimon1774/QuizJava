public class W10 {
    public static void main(String[] args) {
        int score = 67;
        if ((score >= 80) && (score <= 100)) {
            System.out.println("Grade is A");
        } else if ((score >= 75) && (score <= 80)) {
            System.out.println("Grade is B+");
        } else if ((score >= 70) && (score <= 75)) {
            System.out.println("Grade is B");
        } else if ((score >= 65) && (score <= 69)) {
            System.out.println("Grade is C+");
        } else if ((score >= 60) && (score <= 64)) {
            System.out.println("Grade is C");
        } else if ((score >= 55) && (score <= 60)) {
            System.out.println("Grade is D+");
        } else if ((score >= 50) && (score <= 54)) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
    }
}
