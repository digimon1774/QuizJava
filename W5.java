import java.util.Scanner;

public class W5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input total score :");
        int Score = scanner.nextInt();
        String Grade;
        if ((Score >= 80) && (Score <=100))  {
            Grade = "A";
        }
        else if ((Score >= 75) && (Score <=80)) {
            Grade = "B+";
        }
        else if ((Score >=70) && (Score <=75)) {
            Grade = "B";
        }
        else if ((Score >= 65)  && (Score <=69)) {
            Grade = "C+";
        }
        else if ((Score >= 60)  && (Score <=64)) {
            Grade = "C";
        }
        else if ((Score >= 55)  && (Score <=60)) {
            Grade = "D+";
        }
        else if ((Score >=50)  && (Score <=54 )) {
            Grade = "D";
        }
        else{
            Grade = "F";
        }
        
        System.out.println("The Grade is " + Grade);
        scanner.close();
    }
}
