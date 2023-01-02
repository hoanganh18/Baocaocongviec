package Tranning;

import java.util.ArrayList;

public class Kiemtra {

	private String message;
	private Integer point;
	private boolean check;

	public Kiemtra() {

	}

	public Kiemtra(String message, Integer point, boolean check) {
		this.message = message;
		this.point = point;
		this.check = check;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public static void main(String[] args) {
		ArrayList<Kiemtra> kiemtra = new ArrayList<Kiemtra>();

		Kiemtra kt = new Kiemtra("Nhan xet", 10, false);
		Kiemtra kt1 = new Kiemtra("Diem thap", 1, false);
		Kiemtra kt2 = new Kiemtra("Diem cao", 9, true);

		kiemtra.add(kt);
		kiemtra.add(kt1);
		kiemtra.add(kt2);
		for (int i = 0; i < kiemtra.size(); i++) {
			System.out.println(kiemtra.get(i));
		}
		for (int i = kiemtra.size() - 1; i >= 0; i--) {
			System.out.println(kiemtra.get(i));
		}

		int n = 0;
		while (n < kiemtra.size()) {
			System.out.println(kiemtra.get(n));
			n++;
		}
		int m = kiemtra.size()-1;
		while (m > 0) {
			System.out.println(kiemtra.get(m));
			m--;
		}

	}
}
