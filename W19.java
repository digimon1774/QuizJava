public class W19 {
    public static void main(String[] args) {
        int score = 67;
        if ((score != 79) && (score >= 80)) {
            System.out.println("Grade is A");
        } else if ((score != 74) && (score >= 75)) {
            System.out.println("Grade is B+");
        } else if ((score != 69) && (score >= 70)) {
            System.out.println("Grade is B");
        } else if ((score != 64) && (score >= 65)) {
            System.out.println("Grade is C+");
        } else if ((score != 64) && (score >= 60)) {
            System.out.println("Grade is C");
        } else if ((score != 59) && (score >= 55)) {
            System.out.println("Grade is D+");
        } else if ((score != 49) && (score >= 50)) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
    }
}
