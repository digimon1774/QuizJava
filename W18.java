import java.util.Scanner;

public class W18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("คะแนน: ");
        double point = scanner.nextDouble();

        if ((point != 79) && (point >=80)) {
            System.out.println("Grade A");
        } else if ((point != 74) && (point >=75)) {
            System.out.println("Grade B+");
        } else if ((point != 69) && (point >=70)) {
            System.out.println("Grade B");
        } else if ((point != 64) && (point >=65)) {
            System.out.println("Grade C+");
        } else if ((point != 59) && (point >=60)) {
            System.out.println("Grade C");
        } else if ((point != 54) && (point >= 55)) {
            System.out.println("Grade D+");
        } else if ((point != 49) && (point >= 50)) {
            System.out.println("Grade D");
        } else {
            System.err.println("Grane F");
        }
            }
    }

