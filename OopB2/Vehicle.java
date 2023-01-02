package OopB2;

public class Vehicle {
	private int maXe;
	private int dungTich;
	private double triGia;
	private String chuXe;
	private String moTa;
	
	public Vehicle() {
	
	}
	public Vehicle(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
		super();
		this.maXe = maXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.chuXe = chuXe;
		this.moTa = moTa;
	}
	public int getMaXe() {
		return maXe;
	}
	public void setMaXe(int maXe) {
		this.maXe = maXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public String toString() {
		return "Vehicle [maXe=" + maXe + ", dungTich=" + dungTich + ", triGia=" + triGia + ", chuXe=" + chuXe
				+ ", moTa=" + moTa + "]";
	}
	
	public double tinhThue() {
		double thue=0.0;
		if(dungTich<100) {
			thue = triGia*0.01;
		}
		if(dungTich<200 && dungTich >100) {
			thue = triGia*0.03;
		}
		if(dungTich>200) {
			thue = triGia*0.05;
		}
		return thue;
	}
	
	public void inThue() {
		System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
	}
	

}
