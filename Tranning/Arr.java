package Tranning;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {

		int n, m;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so dong ");
		n = scanner.nextInt();
		System.out.println("Nhap so cot ");
		m = scanner.nextInt();

		int[][] A = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhap phan tu thu [" + i + "," + j + "]");
				A[i][j] = scanner.nextInt();
			}
		}
		int sum = 0;
		System.out.println("Mang vua nhap: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(A[i][j] + "\t");
				sum += A[i][j];
			}

			System.out.println("\n");

		}
		System.out.println("Tong la: " + sum);
	}
}
