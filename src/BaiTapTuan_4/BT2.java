import java.util.Scanner;

public class BT2{
	public static void main(String[] args) {
	int number;
	System.out.println("Nhập số nguyên: ");
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	if(number % 2 == 0) {
		System.out.println("Số chẵn");
	}
	else {
		System.out.println("Số lẻ");
		}
	}
}
