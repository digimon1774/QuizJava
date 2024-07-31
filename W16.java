import java.util.Scanner;

public class W16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        int score = scanner.nextInt();
        if ((score != 79) && (score >= 80)) {
            System.out.println(" grade A");
        } else if ((score != 74) && (score >= 75)) {
            System.out.println("grade B+");
        } else if ((score != 69) && (score >= 70)) {
            System.out.println("grade B");
        } else if ((score != 64) && (score >= 65)) {
            System.out.println(" grade C+");
        } else if ((score != 59) && (score >= 60)) {
            System.out.println("grade C");
        } else if ((score != 54) && (score >= 55)) {
            System.out.println("grade D+");
        } else if ((score != 49) && (score >= 50)) {
            System.out.println("grade D");
        } else if (score < 49) {
            System.out.println("you didn't pass");
        } else {
            System.out.println("please enter score 1-100");
        }
    }
}
