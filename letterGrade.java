import java.util.Scanner;
import java.io.DataInputStream;
public class letterGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int grade = scanner.nextInt();

		if (grade >= 100) {
			System.out.println("A+");
		} else if (grade >= 96) {
			System.out.println("A");
		} else if (grade >= 92) {
			System.out.println("A-");
		} else if (grade >= 89) {
			System.out.println("B+");
		} else if (grade >= 86) {
			System.out.println("B");
		} else if (grade >= 82) {
			System.out.println("B-");
		} else if (grade >= 79) {
			System.out.println("C+");
		} else if (grade >= 76) {
			System.out.println("C");
		} else if (grade >= 72) {
			System.out.println("C-");
		} else if (grade >= 69) {
			System.out.println("D+");
		} else if (grade >= 66) {
			System.out.println("D");
		} else if (grade >= 62) {
			System.out.println("D-");
		} else {
			System.out.println("F");
}
}
}
