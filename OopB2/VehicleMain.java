package OopB2;

import java.io.Flushable;
import java.util.Scanner;

public class VehicleMain {

	static Scanner sc = new Scanner(System.in);

	static void nhapXe(Vehicle vc) {
		System.out.println("Nhap ma xe: ");
		vc.setMaXe(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten chu xe: ");
		vc.setChuXe(sc.nextLine());
		System.out.println("Nhap dung tich xe: ");
		vc.setDungTich(sc.nextInt());
		System.out.println("Nhap tri gia xe: ");
		vc.setTriGia(sc.nextDouble());
		sc.nextLine();
		System.out.println("Nhap mo ta  xe: ");
		vc.setMoTa(sc.nextLine());

	}

	public static void main(String[] args) {
		Vehicle v[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Chon menu:  ");
			System.out.println("1.Nhap so luong xe va dien thong tin cho cac xe: " + "\n"
					+ "2. Xem thong tin thue cua xe " + "\n" + "3.Thoat ");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Nhap so luong xe: ");
				n = sc.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println(" Nhap xe thu: " + (i + 1));
					v[i] = new Vehicle();
					nhapXe(v[i]);
				}
				break;
			case 2:
				System.out.printf("%5s %5s %5s %10s %10s %8s \n", "Ma xe", "Chu xe", "Dung tich", "Tri gia", "mo ta",
						"Thue");
				for (int i = 0; i < n; i++) {
					v[i].inThue();
				}
				break;

			default:
				System.out.println("Da thoat");
				flag = false;
				break;
			}

		} while (flag);
	}
}
