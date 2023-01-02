package Tranning;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int a = sc.nextInt();
		if (a < 2 || a > 6) {
			System.out.println("Nhap lai: ");
		} else {
			switch (a) {
			case 2:
				System.out.println("Thu 2 ");
				break;
			case 3:
				System.out.println("Thu 3");
				break;
			case 4:
				System.out.println("Thu 4 ");
				break;
			case 5:
				System.out.println("Thu 5 ");
				break;
			case 6:
				System.out.println("Thu 6 ");
				break;
			case 7:
				System.out.println("Thu 7 ");
				break;
			default:
				System.out.println("Chu nhat 6");
				break;
			}
		}
	}
}
