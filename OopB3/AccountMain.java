package OopB3;

import java.util.Scanner;

public class AccountMain {

	static void nhapAccount(Account ac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tai khoan: ");
		ac.setSoTk(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten tai khoan: ");
		ac.setTenTk(sc.nextLine());
		ac.setSoTienTrongTk(50.0);
	}
       
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		Account a[] = null;
		int b,n = 0;
		boolean flag = true;
		int s,d;
		do {
			System.out.println("Chon menu");
			System.out.println("1.Nhap thong tin khach hang " + "\n" + "2.Xuat thong tin khach hang " + "\n"
					+ "3.Rut tien " + "\n" + "4.Nap tien" +"\n" + "5.Dao han" + "\n" + "6.Exit");
			b=sc.nextInt();
			
			switch (b) {
			case 1:
				System.out.println("Nhap so luong khach hang ");
				n=sc.nextInt();
				a = new Account[n];
				for(int i=0; i<n;i++) {
					System.out.println("Khach hang thu "+ (i+1));
					a[i]= new Account();
					nhapAccount(a[i]);
				}

				break;
			case 2:
				System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
				for(int i=0; i<n;i++) {
					a[i].inTk();
				}

				break;
			case 3:
				System.out.println("Nhap so tai khoan ban muon rut");
				s = sc.nextInt();
				for(int i= 0; i<n; i++) {
					d= a[i].getSoTk();
					if(s==d) {
						System.out.println("Ban chon tai khoan: "+ d);
						a[i].rutTien();
					}
					else {
						System.out.println("");
					}
				}

				break;
			case 4:
				System.out.println("Nhap so tai khoan ban can nap: ");
				s=sc.nextInt();
				for(int i=0; i<n;i++) {
					d= a[i].getSoTk();
					if(s==d) {
						System.out.println("Ban chon tai khoan "+ d);
						a[i].napTien();
					}
				}

				break;
			case 5:
				System.out.println("Nhap so tai khoan can dao han");
				s = sc.nextInt();
				for(int i= 0; i<n; i++) {
					d= a[i].getSoTk();
					if(s==d) {
						System.out.println("Ban chon tai khoan: "+ d);
						a[i].daoHan();
					}
					else {
						System.out.println("");
					}
				}

				break;
			case 6:
				System.out.println("Da thoat!!!");
				flag = false;

				break;
			default:
				
				break;
			}

		} while (flag);
	}

}
