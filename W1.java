import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input total score :");
        int Score = scanner.nextInt();
        String Grade;
        if (Score >= 80) {
            Grade = "A";
        }
        else if (Score >= 75) {
            Grade = "B+";
        }
        else if (Score >=70) {
            Grade = "B";
        }
        else if (Score >= 65) {
            Grade = "C+";
        }
        else if (Score >= 60) {
            Grade = "C";
        }
        else if (Score >= 55) {
            Grade = "D+";
        }
        else if (Score >=50) {
            Grade = "D";
        }
        else{
            Grade = "F";
        }
        
        System.out.println("The Grade is " + Grade);
        scanner.close();
    }
}
