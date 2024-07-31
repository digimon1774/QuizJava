import java.util.Scanner;

public class W11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input total score :");
        int Score = scanner.nextInt();
        String Grade;
        if (Score > 79) {
            Grade = "A";
        }
        else if (Score > 74) {
            Grade = "B+";
        }
        else if (Score >69) {
            Grade = "B";
        }
        else if (Score >64) {
            Grade = "C+";
        }
        else if (Score > 59) {
            Grade = "C";
        }
        else if (Score > 54) {
            Grade = "D+";
        }
        else if (Score > 49) {
            Grade = "D";
        }
        else{
            Grade = "F";
        }
        
        System.out.println("The Grade is " + Grade);
        scanner.close();
    }
}
