import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("คะแนน: ");
        double point = scanner.nextDouble();

        if (point > 79) {
            System.out.println("Grade A");
        } else if (point > 74)  {
            System.out.println("Grade B+");
        } else if (point > 69)  {
            System.out.println("Grade B");
        } else if (point > 64)  {
            System.out.println("Grade C+");
        } else if (point > 59) {
            System.out.println("Grade C");
        } else if (point > 54)  {
            System.out.println("Grade D+");
        } else if (point > 49)  {
            System.out.println("Grade D");
        } else {
            System.err.println("Grane F");
        }
            }
    }