package Tranning;

import java.awt.Checkbox;
import java.util.Scanner;

public class Sngto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int n = sc.nextInt();
		if (check(n)) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong phai la so nguyen to");
		}
		sc.close();
	}

	public static boolean check(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}
