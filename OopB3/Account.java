package OopB3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {

	private Integer soTk;
	private String tenTk;
	private Double soTienTrongTk;

	public Account() {

	}

	public Integer getSoTk() {
		return soTk;
	}

	public void setSoTk(Integer soTk) {
		this.soTk = soTk;
	}

	public String getTenTk() {
		return tenTk;
	}

	public void setTenTk(String tenTk) {
		this.tenTk = tenTk;
	}

	public Double getSoTienTrongTk() {
		return soTienTrongTk;
	}

	public void setSoTienTrongTk(Double soTienTrongTk) {
		this.soTienTrongTk = soTienTrongTk;
	}

	public Account(Integer soTk, String tenTk, Double soTienTrongTk) {
		super();
		this.soTk = soTk;
		this.tenTk = tenTk;
		this.soTienTrongTk = soTienTrongTk;
	}

	@Override
	public String toString() {
		return "Account [soTk=" + soTk + ", tenTk=" + tenTk + ", soTienTrongTk=" + soTienTrongTk + "]";
	}

	Scanner sc = new Scanner(System.in);

	public Double napTien() {
		Double nap;
		System.out.println("Nhap so tien ban can nap: ");
		nap = sc.nextDouble();
		if (nap > 0) {
			soTienTrongTk += nap;
			System.out.println("So tien ban vua nap la: " + nap);
		} else {
			System.out.println("So tien ban nop khong hop le: ");
		}
		return nap;
	}

	public Double rutTien() {
		Double rut;
		Double phi = (double) 5;
		System.out.println("Nhap so tien ban can rut: ");
		rut = sc.nextDouble();
		if (rut <= soTienTrongTk) {
			soTienTrongTk = soTienTrongTk - (rut + phi);
			System.out.println("So tien ban rut la: " + rut);
		} else {
			System.out.println("So tien rut phai nho hon hoac bang so tien trong tai khoan: ");
			return rutTien();
		}
		return rut;
	}

	public Double daoHan() {
		Double lai = 0.035;
		soTienTrongTk = soTienTrongTk + (soTienTrongTk * lai);
		System.out.println("Ban vua duoc " + lai + " tu dao han 1 thang");

		return soTienTrongTk;
	}
	
	void inTk() {
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		String str = currencyEN.format(soTienTrongTk);
		System.out.printf("%-10d %-20s %-20s \n",soTk, tenTk,str);
	}
	
}
