import java.util.Scanner;

public class W8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("คะแนน: ");
        double point = scanner.nextDouble();

        if ((point >= 80) && (point <=100)) {
            System.out.println("Grade A");
        } else if ((point >= 75) && (point <=80)) {
            System.out.println("Grade B+");
        } else if ((point >= 70) && (point <=75)) {
            System.out.println("Grade B");
        } else if ((point >= 65) && (point <=69)) {
            System.out.println("Grade C+");
        } else if ((point >= 60) && (point <=64)) {
            System.out.println("Grade C");
        } else if ((point >= 55) && (point <= 60)) {
            System.out.println("Grade D+");
        } else if ((point >= 50) && (point <= 54)) {
            System.out.println("Grade D");
        } else {
            System.err.println("Grane F");
        }
            }
    }

